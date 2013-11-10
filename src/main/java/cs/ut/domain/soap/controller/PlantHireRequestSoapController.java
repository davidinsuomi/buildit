package cs.ut.domain.soap.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import cs.ut.domain.HireRequestStatus;
import cs.ut.domain.Plant;
import cs.ut.domain.PurchaseOrder;
import cs.ut.domain.soap.client.*;
import cs.ut.domain.transfer.PlantDataTransferObject;

import org.joda.time.format.DateTimeFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PlantHireRequestSoapController {

	@RequestMapping(value = "/planthirerequests/queryPlant", method = RequestMethod.GET)
	public String queryPlant(ModelMap model) {
		System.out.println("controller");
		// addDateTimeFormatPatterns(model);
		model.addAttribute("plantquery", new PlantDataTransferObject());
		return "planthirerequests/queryPlant/search";
	}

	void addDateTimeFormatPatterns(ModelMap modelMap) {
		modelMap.put(
				"plantHRBean_startr_date_format",
				DateTimeFormat.patternForStyle("MM",
						LocaleContextHolder.getLocale()));
		modelMap.put(
				"plantHRBean_endr_date_format",
				DateTimeFormat.patternForStyle("MM",
						LocaleContextHolder.getLocale()));
	}

	@RequestMapping(value = "/planthirerequests/queryPlant", method = RequestMethod.POST)
	public String displayPlant(@Valid PlantDataTransferObject plant,
			ModelMap model, HttpServletRequest request)
			throws DatatypeConfigurationException {

		PlantSOAPServiceService plantService = new PlantSOAPServiceService();
		PlantSOAPService plantPort = plantService.getPlantSOAPServicePort();
		PlantResourceList plantList = plantPort.getAllPlants();
		List<PlantResource> plants = plantList.getListOfPlantResources();
		for (PlantResource plantResource : plants) {
			System.out.println(plantResource.getPlantName());
			if (plantResource.getPlantName().equalsIgnoreCase(plant.getName()))

			{
				GregorianCalendar start, end;

				PurchaseOrderResource poResource = new PurchaseOrderResource();
				poResource.setPlantResource(plantResource);
				start = plant.getStartDate().toGregorianCalendar();
				end = plant.getEndDate().toGregorianCalendar();
				int days = daysBetween(start.getTime(),end.getTime());
				int priceperday = plantResource.getPricePerDay().intValue();
				int totalCost = days * priceperday;
				BigDecimal total = new BigDecimal (totalCost);
				poResource.setTotalCost(total);
				String startDate = plant.getStartDate().toString();
				XMLGregorianCalendar xgc = DatatypeFactory.newInstance()
						.newXMLGregorianCalendar(startDate);
				poResource.setEndDate(xgc);
				poResource.setStartDate(xgc);
				plantPort.createPurchaseOrder(poResource);

				// plantPort.createPurchaseOrder(arg0);
			}
		}
		model.addAttribute("name", plant.getName());
		model.addAttribute("startDate", plant.getStartDate());
		model.addAttribute("endDate", plant.getEndDate());
		System.out.println("this is the result mapping");
		return "planthirerequests/queryPlant/result";

	}

	public int daysBetween(Date d1, Date d2) {
		return (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
	}
}
