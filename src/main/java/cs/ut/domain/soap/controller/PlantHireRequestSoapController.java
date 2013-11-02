package cs.ut.domain.soap.controller;
import cs.ut.domain.transfer.PlantDataTransferObject;

import org.joda.time.format.DateTimeFormat;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/planthirerequests/queryPlant")
public class PlantHireRequestSoapController {

	
//	@RequestMapping(method = RequestMethod.POST, value = "/phr")
//	public ResponseEntity<Void> createPlantHireRequestResource(
//			@RequestBody PlantHireRequestResource res) {
	
	@RequestMapping(method = RequestMethod.GET)
	public String  queryPlant(ModelMap model){
		System.out.println("controller");
		addDateTimeFormatPatterns(model);
		model.put("plantquery", new PlantDataTransferObject());
		return "planthirerequests/queryPlant/search";
	}
	void addDateTimeFormatPatterns(ModelMap modelMap) { 
		 modelMap.put("plantHRBean_startr_date_format", 
		 DateTimeFormat.patternForStyle("MM", LocaleContextHolder.getLocale())); 
		 modelMap.put("plantHRBean_endr_date_format", 
		 DateTimeFormat.patternForStyle("MM", LocaleContextHolder.getLocale())); 
		} 

}
