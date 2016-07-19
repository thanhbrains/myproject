package com.ttx.my.spring.boot.data.jpa.thymleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ttx.my.spring.boot.data.jpa.thymleaf.dto.CountriesDTO;
import com.ttx.my.spring.boot.data.jpa.thymleaf.service.RegionsService;

@Controller
public class HomeController {

	@Autowired
	RegionsService regionsService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String root() {
		return "redirect:/index";
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		for(CountriesDTO dto: regionsService.getRegions(4l).getCountrieses()){
			System.out.println(dto.getCountryName());
		}
		System.out.println(regionsService.getLstRegions().size());
		return "index";
	}
}
