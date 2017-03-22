package com.property.mgt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.property.mgt.domain.Building;
import com.property.mgt.domain.Property;
import com.property.mgt.domain.Unit;
import com.property.mgt.service.PropertyService;
import com.property.mgt.service.UnitService;

@Controller
@RequestMapping("/property")
public class PropertyController {

	@Autowired
	PropertyService propertyService;
	
	@Autowired
	private UnitService unitService;

	@RequestMapping(value = { "/home" }, method = RequestMethod.GET)
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
		return "property/addBuilding";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String addBuildingPost(
			@ModelAttribute("building") Building building) {
		System.out.println(building.getName());
		propertyService.saveProperty(building);
		return "redirect:/property/buildings";
	}

	@RequestMapping(value = "/building", method = RequestMethod.GET)
	public String building() {
		return "property/buildingDetails";
	}

	@RequestMapping(value = "/buildings", method = RequestMethod.GET)
	public String buildings(Model model) {
		model.addAttribute("buildings", propertyService.findAllBuildings());
		return "property/buildings";
	}
	
	@RequestMapping(value = "/building/{id}", method = RequestMethod.GET)
	public String buildings(@PathVariable("id") long propertyId, Model model) {
		model.addAttribute("building", propertyService.findOnePropertyById(propertyId));
		return "property/buildingDetails";
	}
	
/*
 * Units Management*/
	@RequestMapping(value = "/addunit/{id}", method = RequestMethod.GET)
	public String buildings(@ModelAttribute("unit") Unit unit, @PathVariable("id") long propertyId, Model model) {
		Property property = propertyService.findOnePropertyById(propertyId);
		unit.setProperty(property); 
		model.addAttribute("unit", unit);
		return "property/addUnit";
	}

	@RequestMapping(value = "/addunit", method = RequestMethod.POST)
	public String addUnit(
			@ModelAttribute("unit") Unit unit, 
			RedirectAttributes flashAttributes) {
		System.out.println(unit.getUnitNumber());
		unitService.saveUnit(unit);
		flashAttributes.addFlashAttribute(unit);
		return "redirect:/property/units";
	}

	@RequestMapping(value = "/unit", method = RequestMethod.GET)
	public String unit() {
		return "property/unitDetails";
	}

	@RequestMapping(value = "/units", method = RequestMethod.GET)
	public String units(Model model) {
		model.addAttribute("units", unitService.findAll());
		return "property/units";
	}
	
	@RequestMapping(value = "/init/{id}", method = RequestMethod.GET)
	public String init(@PathVariable("id") long initId, Model model) {
		model.addAttribute("unit", unitService.findOneUnitById(initId));
		return "property/unitDetails";
	}

}
