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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.property.mgt.domain.BusinessClient;
import com.property.mgt.domain.Client;
import com.property.mgt.domain.PersonClient;
import com.property.mgt.service.BusinessClientService;
import com.property.mgt.service.PersonClientService;

@Controller
public class ClientController {

	@Autowired
	PersonClientService personClientService;
	
	@Autowired
	BusinessClientService businessClientService;

	
	/* 
	 * Controllers for person clients
	 */
	
	// Used for displaying PersonClients

	@RequestMapping(value = "/listPersonClients", method = RequestMethod.GET)
	public String listPersonClients(Model model) {
		List<PersonClient> personClientList = personClientService.findAll();
		model.addAttribute("personClientList", personClientList);
		return "client/personClients";
	}

	// display add Personclient form

	@RequestMapping(value = "/addPersonClient", method = RequestMethod.GET)
	public String inputPersonClient(@ModelAttribute("personClient") PersonClient personClient) {
		return "client/addPersonClient";
	}

	// Save the Personclient
	@RequestMapping(value = "/addPersonClient", method = RequestMethod.POST)
	public String savePersonClient(@Valid @ModelAttribute("personClient") PersonClient personClient, BindingResult result, RedirectAttributes redirectAttributes) {
		if (result.hasErrors()) {
			return "client/addPersonClient";
		}

		// do the try catch exception handling later
		personClientService.save(personClient);

		redirectAttributes.addFlashAttribute("personClient", personClient);

		return "redirect:/personClientDetails";
	}

	// Display the details of a saved Personclient

	@RequestMapping(value = "/personClientDetails", method = RequestMethod.GET)
	public String displayPersonClientDetails() {
		return "client/personClientDetails";
	}
	
	// Delete a Person Client
	
	@RequestMapping(value = "/deletePersonClient", method = RequestMethod.GET)
	public String deleteCustomer(@RequestParam("personClientId") long personClientId, Model theModel) {
		
		// delete the customer
		personClientService.delete(personClientService.findOne(personClientId));
		
		return "redirect:/listPersonClients";
	}
	
	@RequestMapping(value = "/updatePersonClient", method = RequestMethod.GET)
	public String showPersonClientFormForUpdate(@RequestParam("personClientId") long personClientId , Model model) {
		model.addAttribute(personClientService.findOne(personClientId));
		
		return "client/addPersonClient";
	}
	
	/* 
	 * Controllers for business clients
	 */
	
	// Used for displaying Business Clients

		@RequestMapping(value = "/listBusinessClients", method = RequestMethod.GET)
		public String listBusinessClients(Model model) {
			List<BusinessClient> businessClientList = businessClientService.findAll();
			model.addAttribute("businessClientList", businessClientList);
			return "client/businessClients";
		}

		// display add Business client form

		@RequestMapping(value = "/addBusinessClient", method = RequestMethod.GET)
		public String inputBusinessClient(@ModelAttribute("businessClient") BusinessClient businessClient) {
			return "client/addBusinessClient";
		}

		// Save the Business client
		@RequestMapping(value = "/addBusinessClient", method = RequestMethod.POST)
		public String saveBusinessClient(@Valid @ModelAttribute("businessClient") BusinessClient businessClient, BindingResult result,	RedirectAttributes redirectAttributes) {
			if (result.hasErrors()) {
				return "client/addBusinessClient";
			}

			// do the try catch exception handling later
			businessClientService.save(businessClient);

			redirectAttributes.addFlashAttribute("businessClient", businessClient);

			return "redirect:/businessClientDetails";
		}

		// Display the details of a saved Personclient

		@RequestMapping(value = "/businessClientDetails", method = RequestMethod.GET)
		public String displayBusinessClientDetails() {
			return "businessClientDetails";
		}

	
}
