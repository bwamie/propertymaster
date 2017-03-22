package com.property.mgt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.property.mgt.domain.Contact;
import com.property.mgt.domain.Owner;
import com.property.mgt.domain.Person;
import com.property.mgt.domain.PersonOwner;
import com.property.mgt.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	TestService testService;
	
	@RequestMapping(value="/testpage", method=RequestMethod.GET)
	public String testpage(){
		System.out.println("Saving....testpage");
		saveOwner();
		System.out.println("Saving complete....testpage");
		return "testpage";
	}
	
	@RequestMapping(value="/saveTest", method=RequestMethod.GET)
	public String saveTest(Model model){
		System.out.println("Saving....testingvvvv----");
		model.addAttribute("test", "Hello test");
		saveOwner();
		System.out.println("Saving complete....testingvvv----");
		return "test";
	}
	
	
	
//	@RequestMapping(value="/propertyHome", method=RequestMethod.GET)
//	public String saveTest2(){
//		System.out.println("Saving2....");
//		saveOwner();
//		System.out.println("Saving complete....");
//		return "test";
//	}
	
//	@RequestMapping(value = "/propertyHome", method = RequestMethod.GET)
//	public String propertyHome() {
//		System.out.println("Helloooo");
//		return "propertyHome";
//	}
	
	private void saveOwner(){
		Contact contact = new Contact();
		contact.setCity("Fairfield");
		contact.setState("IA");
		contact.setEmail("bwamie@gmail.com");
		contact.setPhone("884847474444");
		contact.setZipCode(52556);
		Person p = new Person();
		p.setContact(contact);
		p.setFirstName("Edwin");
		p.setLastName("Bwambale");
		PersonOwner po = new PersonOwner();
		po.setPerson(p);
		Owner o = po;
		testService.Save(o);
	}

}
