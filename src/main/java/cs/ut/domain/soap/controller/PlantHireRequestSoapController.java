package cs.ut.domain.soap.controller;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import cs.ut.domain.transfer.PlantDataTransferObject;

import org.joda.time.format.DateTimeFormat;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PlantHireRequestSoapController {

	
//	@RequestMapping(method = RequestMethod.POST, value = "/phr")
//	public ResponseEntity<Void> createPlantHireRequestResource(
//			@RequestBody PlantHireRequestResource res) {
	
	
	@RequestMapping(value="/planthirerequests/queryPlant",method = RequestMethod.GET)
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
	@RequestMapping(value = "/planthirerequests/queryPlant",method = RequestMethod.POST)
	public String displayPlant(@Valid PlantDataTransferObject plant, ModelMap  model, 
			HttpServletRequest request){
		model.addAttribute("name","this is the plant name");
		model.addAttribute("startDate","2012");
		System.out.println("this is the result mapping");
		return "planthirerequests/queryPlant/result";
		
	}
//	@RequestMapping(value = "/planthirerequests/queryPlant/result",method = RequestMethod.GET)
//	public void displayPlant(){
//		
//		System.out.println("result");
//	}
//	
	

}
