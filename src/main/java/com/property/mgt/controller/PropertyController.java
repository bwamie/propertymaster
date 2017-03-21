package com.property.mgt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.property.mgt.domain.Building;

@Controller
@RequestMapping(value="/property")
public class PropertyController {
	
	@RequestMapping(value="/addProperty", method=RequestMethod.GET)
	public String addProperty(@ModelAttribute("building") Building building){
		return "addProperty";
	}
	
	@RequestMapping(value="/addBuilding", method=RequestMethod.GET)
	public String addBuilding(@ModelAttribute("building") Building building, RedirectAttributes flashAttributes){
		System.out.println(building.getName());
		flashAttributes.addAttribute(building);
		return "redirect:/buildingDetails";
	}

}
