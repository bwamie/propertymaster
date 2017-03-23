package com.property.mgt.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.property.mgt.domain.Client;
import com.property.mgt.domain.Staff;
import com.property.mgt.service.StaffService;
import com.property.mgt.service.StaffService;

@Controller
public class StaffController {

	@Autowired
	StaffService staffService;
	
	public StaffController(){
		
	}
	
	// Used for displaying staffList
	
	@RequestMapping(value = {"/staffList"}, method = RequestMethod.GET)
	public String listClients(Model model) {
		
		List<Staff> staffList = staffService.findAll();
		model.addAttribute("StaffList", staffList);
		return "staff/staffList";
	}
	
	// display add staff form
	
	@RequestMapping(value = "/addStaff", method = RequestMethod.GET)
	public String addStaff(@ModelAttribute("staff") Staff staff){
		
		return "staff/staffForm";	
	}
	
	
	@RequestMapping(value = "/addStaff", method = RequestMethod.POST)
	public String saveStaff(@Valid @ModelAttribute("staff") Staff staff, BindingResult result, RedirectAttributes redirectAttributes){
		System.out.println("updating in post /addStaff");
		if(result.hasErrors()){
			System.out.println("Error found inside /addStaff");
			return "staff/staffForm";
		}
		
		System.out.println("updating in post /addStaff");
		staffService.save(staff);
		redirectAttributes.addFlashAttribute("staff", staff);		
		return "redirect:/staffDetails";	
	}
	
	//Display Staff Details
	@RequestMapping(value = "/staffDetails", method = RequestMethod.GET)
	public String displayPersonClientDetails() {
		return "staff/staffDetails";
	}
	
	
	// Delete a staff
	
		@RequestMapping(value = "/deleteStaff", method = RequestMethod.GET)
		public String deleteStaff(@RequestParam("staffId") long staffId, Model model) {
			
			// delete a staff
			staffService.delete(staffService.findOne(staffId));
			
			return "redirect:/staffList";
		}
		
		
		// Update a staff
		@RequestMapping(value = "/updateStaff", method = RequestMethod.GET)
		public String showStaffFormForUpdate(@RequestParam("staffId") long staffId , Model model) {
			model.addAttribute(staffService.findOne(staffId));
			
			return "staff/staffForm";
		}
	
		@RequestMapping(value = "/getStaffDetails", method = RequestMethod.GET)
		public @ResponseBody Staff getStaffDetails(@RequestParam("staffId") long staffId) {
			
			System.out.println("/getStaffDetails controller called");
			System.out.println(staffId);
		
			Staff theStaff = staffService.findOne(staffId);
			System.out.println(theStaff.getPerson().getFirstName());
			return theStaff;
			
		}
	
}
