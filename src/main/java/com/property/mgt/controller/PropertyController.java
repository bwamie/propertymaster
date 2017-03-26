package com.property.mgt.controller;

import java.io.File;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.property.mgt.domain.Building;
import com.property.mgt.domain.Business;
import com.property.mgt.domain.BusinessClient;
import com.property.mgt.domain.Contact;
import com.property.mgt.domain.Lease;
import com.property.mgt.domain.Payment;
import com.property.mgt.domain.Property;
import com.property.mgt.domain.Unit;
import com.property.mgt.exception.PhotoUploadException;
import com.property.mgt.exception.PropertyPhotoUploadException;
import com.property.mgt.exception.UnitPhotoUploadException;
import com.property.mgt.service.BusinessClientService;
import com.property.mgt.service.LeaseService;
import com.property.mgt.service.PaymentService;
import com.property.mgt.service.PersonClientService;
import com.property.mgt.service.PropertyService;
import com.property.mgt.service.UnitService;
import com.property.mgt.util.SessionIdentifierGenerator;

@Controller
@RequestMapping("/property")
public class PropertyController {

	@Autowired
	PropertyService propertyService;

	@Autowired
	private UnitService unitService;

	@Autowired
	private LeaseService leaseService;

	@Autowired
	PersonClientService personClientService;

	@Autowired
	BusinessClientService businessClientService;
	
	@Autowired
	PaymentService paymentService;
	
	@Autowired
	ServletContext servletContext;


	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public String propertyHome() {
		System.out.println("Helloooo");
		return "propertyHome";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String addProperty(@ModelAttribute("building") Building building) {
		return "register";
	}

	@RequestMapping(value = "/addBuilding", method = RequestMethod.GET)
	public String addBuilding(@ModelAttribute("building") Building building) {
		return "addBuilding";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String addBuildingPost(@ModelAttribute("building") Building building) {
		System.out.println(building.getName());
		
		building.setPhotoName(SessionIdentifierGenerator.getRandomString());
		
		MultipartFile propertyPhoto = building.getPhoto(); 
		String rootDirectory = servletContext.getRealPath("/");
		// isEmpty means file exists BUT NO Content
		if (propertyPhoto != null && !propertyPhoto.isEmpty()) {
			String fileSeparator = System.getProperty("file.separator");
			try {
				propertyPhoto.transferTo(new File(rootDirectory + fileSeparator
						+ "resources" + fileSeparator + "images"
						+ fileSeparator + "" + building.getPhotoName() + ".png"));
			} catch (Exception e) {
				e.printStackTrace();
				throw new PropertyPhotoUploadException("Building Photo missing!", building);
			}
		}else
			throw new PropertyPhotoUploadException("Building Photo missing!", building);
		
		propertyService.saveProperty(building);
		return "redirect:/property/buildings";
	}

	@RequestMapping(value = "/building", method = RequestMethod.GET)
	public String building() {
		return "buildingDetails";
	}

	@RequestMapping(value = "/buildings", method = RequestMethod.GET)
	public String buildings(Model model) {
		model.addAttribute("buildings", propertyService.findAllBuildings());
		return "buildings";
	}

	@RequestMapping(value = "/building/{id}", method = RequestMethod.GET)
	public String buildings(@PathVariable("id") long propertyId, Model model) {
		model.addAttribute("building",
				propertyService.findOnePropertyById(propertyId));
		return "buildingDetails";
	}

	/*
	 * Property Units Management
	 */
	@RequestMapping(value = "/addunit/{id}", method = RequestMethod.GET)
	public String buildings(@ModelAttribute("unit") Unit unit,
			@PathVariable("id") long propertyId, Model model) {
		Property property = propertyService.findOnePropertyById(propertyId);
		unit.setProperty(property);
		model.addAttribute("unit", unit);
		return "addUnit";
	}

	@RequestMapping(value = "/addunit", method = RequestMethod.POST)
	public String addUnit(@ModelAttribute("unit") Unit unit,
			RedirectAttributes flashAttributes) {
		System.out.println(unit.getUnitNumber());
		
		unit.setPhotoName(SessionIdentifierGenerator.getRandomString());
		
		MultipartFile propertyPhoto = unit.getPhoto(); 
		String rootDirectory = servletContext.getRealPath("/");
		// isEmpty means file exists BUT NO Content
		if (propertyPhoto != null && !propertyPhoto.isEmpty()) {
			String fileSeparator = System.getProperty("file.separator");
			try {
				propertyPhoto.transferTo(new File(rootDirectory + fileSeparator
						+ "resources" + fileSeparator + "images"
						+ fileSeparator + "" + unit.getPhotoName() + ".png"));
			} catch (Exception e) {
				e.printStackTrace();
				throw new UnitPhotoUploadException("Unit Photo missing!", unit);
			}
		}else
			throw new UnitPhotoUploadException("Unit Photo missing!", unit);
		
		
		unitService.saveUnit(unit);
		flashAttributes.addFlashAttribute(unit);
		return "redirect:/property/units";
	}

	@RequestMapping(value = "/unit", method = RequestMethod.GET)
	public String unit() {
		return "unitDetails";
	}

	@RequestMapping(value = "/units", method = RequestMethod.GET)
	public String units(Model model) {
		System.out.println("Units...yyyy....xxx");
		model.addAttribute("units", unitService.findAll());
		return "units";
	}
	
	@RequestMapping(value = "/buildingUnits", method = RequestMethod.GET)
	public String buildingUnits(@RequestParam("xyz") long buildingId, Model model) {
		System.out.println("Units...yyyy....xxx"+buildingId);
		List<Unit> units = unitService.findUnitsByBuildingId(buildingId);
		System.out.println(units);
		model.addAttribute("units", units);
		return "units";
	}

	@RequestMapping(value = "/unit/{id}", method = RequestMethod.GET)
	public String init(@PathVariable("id") long initId, Model model) {
		System.out.println("Unit.......");
		model.addAttribute("unit", unitService.findOneUnitById(initId));
		return "unitDetails";
	}

	/*
	 * Lease Management
	 */
	@RequestMapping(value = "/addlease/{id}", method = RequestMethod.GET)
	public String addLease(@ModelAttribute("lease") Lease lease,
			@PathVariable("id") long unitId, Model model) {
		Unit unit = unitService.findOneUnitById(unitId);
		lease.setUnit(unit);
		model.addAttribute("lease", lease);
		return "addLease";
	}

	@RequestMapping(value = "/addlease", method = RequestMethod.POST)
	public String saveLease(@ModelAttribute("lease") Lease lease,
			RedirectAttributes redirectAttributes) {
		System.out.println(lease.getUnit().getUnitId());
		lease.setUnit(unitService.findOneUnitById(lease.getUnit().getUnitId()));

		// ///Test Code////
		BusinessClient businessClient = new BusinessClient();
		Business business = new Business();
		business.setName("ABD");
		business.setContact(new Contact());
		businessClient.setBusiness(business);
		// /Test code////

		lease.setClient(businessClient);

		leaseService.saveLease(lease);
		redirectAttributes.addFlashAttribute(lease);
		return "redirect:/property/leaseSaveDetails";
	}

	@RequestMapping(value = "/leaseSaveDetails", method = RequestMethod.GET)
	public String leaseSaveDetails() {
		return "leaseSaveDetails";
	}

	@RequestMapping(value = "/lease/{id}", method = RequestMethod.GET)
	public String leaseDetails(@PathVariable("id") long leaseId, Model model) {
		System.out.println("Lease.......");
		model.addAttribute("lease", leaseService.findOneLeaseById(leaseId));
		return "leaseDetails";
	}

	@RequestMapping(value = "/unitLease/{id}", method = RequestMethod.GET)
	public String unitLease(@PathVariable("id") long unitId, Model model) {
		System.out.println("In lease...,,,,");
		List<Lease> ls = leaseService.findLeasesByUnitId(unitId);
		System.out.println("Lease......." + ls.size());
		System.out.println(ls);
		model.addAttribute("leases", ls);
		model.addAttribute("lease", ls.get(0));
		return "unitLease";
	}

	@RequestMapping(value = "/clientlease/{id}", method = RequestMethod.GET)
	public String clientlease(@PathVariable("id") long clientId, Model model) {
		List<Lease> ls = leaseService.findLeasesByClientId(clientId);
		System.out.println("Lease......." + ls.size());

		model.addAttribute("leases", ls);
		model.addAttribute("lease", ls.get(0));
		return "unitUlease";
	}

	@RequestMapping(value = "/makepayment/{id}", method = RequestMethod.GET)
	public String makePayment(@PathVariable("id") long leaseId, @ModelAttribute("payment") Payment payment, Model model) {
		System.out.println("Making paments...1");
		Lease lease = leaseService.findOneLeaseById(leaseId);
		System.out.println("Making paments...2"+lease);
		payment.setLease(lease);
		System.out.println("Making paments...2");
		model.addAttribute("payment", payment);
		System.out.println("Making paments...3");
		return "MakePayment";
	}
	
	@RequestMapping(value = "/makepayment", method = RequestMethod.POST)
	public String savePayments(@ModelAttribute("payment") Payment payment,
			RedirectAttributes redirectAttributes) {
		System.out.println("Saving payments...ffff"+payment);
		System.out.println(payment.getLease().getLeaseId()+"Saving payments...ffff");
		System.out.println("Saving payments...ffff"+payment);
		Lease lease = leaseService.findOneLeaseById(payment.getLease().getLeaseId());
		System.out.println("Saving payments...f liz");
		payment.setLease(lease); 
		System.out.println("Saving payments...set liz");

		paymentService.savePayment(payment);
		redirectAttributes.addFlashAttribute(payment);
		return "redirect:/property/paymentSavedSuccess";
	}

	@RequestMapping(value = "/paymentSavedSuccess", method = RequestMethod.GET)
	public String paymentSavedSuccess() {
		return "paymentSavedSuccess";
	}
	
	@RequestMapping(value = "/paymentDetails/{id}", method = RequestMethod.GET)
	public String paymentDetails(@PathVariable("id") long paymentId,  Model model) {
		System.out.println("eg paments...1");
		Payment payment = paymentService.findOnePaymentById(paymentId);
		System.out.println("eg paments...2");
		model.addAttribute("payment", payment);
		System.out.println("eg paments...3");
		return "paymentDetails";
	}

	@RequestMapping(value = "/payments/{id}", method = RequestMethod.GET)
	public String payments(@PathVariable("id") long leasetId,  Model model) {
		System.out.println("g paments...1");
		List<Payment> payments = paymentService.findPaymentByLeaseId(leasetId);
		System.out.println("g paments...2");
		model.addAttribute("payments", payments);
		System.out.println("g paments...3");
		return "payments";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// binder.setDisallowedFields(new String[]{"firstName"});
	}

	@ExceptionHandler(PropertyPhotoUploadException.class)
	public ModelAndView handleError(HttpServletRequest req,
			PropertyPhotoUploadException exception) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("errorMsg", exception.getMessage());
		mav.addObject("building", exception.getProperty());
		mav.setViewName("propertyPhotoUploadError");
		return mav;
	}
	
	@ExceptionHandler(UnitPhotoUploadException.class)
	public ModelAndView handleError(HttpServletRequest req,
			UnitPhotoUploadException exception) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("errorMsg", exception.getMessage());
		mav.addObject("unit", exception.getUnit());
		mav.setViewName("unitPhotoUploadError");
		return mav;
	}
	
	@ExceptionHandler(PhotoUploadException.class)
	public ModelAndView handleError(HttpServletRequest req,
			PhotoUploadException exception) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("errorMsg", exception.getMessage());
		mav.setViewName("/photoUpload");
		return mav;
	}

}
