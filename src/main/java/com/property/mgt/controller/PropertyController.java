package com.property.mgt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.property.mgt.domain.Building;
import com.property.mgt.service.PropertyService;

@Controller
@RequestMapping("/property")
public class PropertyController {

	@Autowired
	PropertyService propertyService;
	
	@RequestMapping(value = {"/home"}, method = RequestMethod.GET)
	public String propertyHome() {
		System.out.println("Helloooo");
		return "property/propertyHome";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String addProperty(@ModelAttribute("building") Building building) {
		return "property/register";
	}

	@RequestMapping(value = "/addBuilding", method = RequestMethod.GET)
	public String addBuilding(@ModelAttribute("building") Building building) {
		System.out.println("========");;
		return "property/addBuilding";
	}
	
	@RequestMapping(value = "/addBuilding", method = RequestMethod.POST)
	public String addBuildingPost(@ModelAttribute("building") Building building,
			RedirectAttributes flashAttributes) {
		System.out.println(building.getName());
		propertyService.saveProperty(building); 
		flashAttributes.addAttribute(building);
		return "redirect:/property/buildingDetails";
	}

}
