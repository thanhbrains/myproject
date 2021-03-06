package com.ttx.my.spring.boot.data.jpa.thymleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ttx.my.spring.boot.data.jpa.thymleaf.dto.RegionsDTO;
import com.ttx.my.spring.boot.data.jpa.thymleaf.service.RegionsService;
import com.ttx.my.spring.boot.data.jpa.thymleaf.utils.TargetCheck;

@Controller
@RequestMapping(value = { "/demo" })
public class DemoController {

	@Autowired
	RegionsService regionsService; 
	
	@RequestMapping(value = { "/region" })
	public String demoRegion(Model model) {

		model.addAttribute("region", new RegionsDTO());
		return "demo/region";
	}

	/*@RequestMapping(value = { "/region" }, method = RequestMethod.POST)
	public String demoRegionPOST(Model model, @ModelAttribute("region") RegionsDTO region, BindingResult result) {

		//binding message validate to client (th:errors)
		result.rejectValue("regionName", null, "Invalid Field");
		return "demo/region";
	}*/
	
	@TargetCheck
	@RequestMapping(value = { "/region" }, method = RequestMethod.POST)
	public String demoValidator(Model model, @ModelAttribute("region") RegionsDTO region, BindingResult result){
		return "demo/region";
	}
}
