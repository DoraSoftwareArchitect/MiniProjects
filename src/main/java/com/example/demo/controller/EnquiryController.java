package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.bindings.CouncellorDto;
import com.example.demo.bindings.EnquiryDTO;
import com.example.demo.service.EnquiryService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class EnquiryController {

	@Autowired
	private EnquiryService enquiryService;

	@GetMapping("/enquiry-page")
	public String loadEnquiryPage(Model model) {

		EnquiryDTO enqDto = new EnquiryDTO();

		model.addAttribute("enquiry", enqDto);
		return "addenquiry";

	}

	@PostMapping("/addenquiry") // In this method type casting is not working as i am getting the field value as
								// null.
	public String addEnquiry(HttpServletRequest request, @ModelAttribute("enquiry") EnquiryDTO enquiry, Model model) {

		HttpSession session = request.getSession(false);
		Integer councellorId = (Integer) session.getAttribute("councellorId"); // councellorId

		boolean status = enquiryService.addEnquiry(enquiry, councellorId);

		if (status) {
			model.addAttribute("smsg", "Enquiry Saved Sucessfully.....");
		} else {
			model.addAttribute("emsg", "Enquiry does not saved....");
		}

		return "addenquiry";

	}

//	@PostMapping("/addenquiry")
//	public String addEnquiry(HttpServletRequest request, @ModelAttribute("enquiry") EnquiryDTO enquiry, Model model) {
//
//		HttpSession session = request.getSession(false);
//
//		// Ensure the session attribute is of the expected type
//		Object sessionAttribute = session.getAttribute("councellorId");
//
//		String councellorId = null;
//		if (sessionAttribute instanceof Integer) {
//			councellorId = (Integer) sessionAttribute;
//		} else if (sessionAttribute instanceof CouncellorDto) {
//			CouncellorDto dto = (CouncellorDto) sessionAttribute;
//			councellorId = dto.getId(); // Assuming there's a getCounsellorId() method in CouncellorDto
//		}
//
//		if (councellorId == null) {
//			model.addAttribute("emsg", "Invalid counsellor ID.");
//			return "addenquiry";
//		}
//
//		boolean status = enquiryService.addEnquiry(enquiry, councellorId);
//
//		if (status) {
//			model.addAttribute("smsg", "Enquiry Saved Successfully.");
//		} else {
//			model.addAttribute("emsg", "Enquiry could not be saved.");
//		}
//
//		return "addenquiry";
//	}

	
	
	
	
	
	
	
//	@GetMapping("/view-enquiry")
//	public String getEnquiry(HttpServletRequest req, Model model) {
//
//		HttpSession session = req.getSession(false);
//
//		Integer attribute = (Integer) session.getAttribute("councellorId");
//
//		List<EnquiryDTO> enquiries = enquiryService.getEnquiries(attribute);
//
//		model.addAttribute("enquiries", enquiries); // Here key is enquiries and the value is the
//													// list.
//
//		return "view-enquiry";
//	}
//	
	
	
	
	@GetMapping("/view-enquiries")
	public String getEnquiry(HttpServletRequest req, Model model) {
	    HttpSession session = req.getSession(false);

	    // Validate session and check for the attribute
	    if (session == null || session.getAttribute("councellorId") == null) {
	        model.addAttribute("emsg", "Session expired or counselor not found. Please log in again.");
	        return "redirect:/login"; // Redirect to the login page or handle session expiration
	    }

	    Integer counsellorId = null;

	    // Check the type of the session attribute and extract counselor ID
	    Object attribute = session.getAttribute("councellorId");
	    if (attribute instanceof Integer) {
	        counsellorId = (Integer) attribute;
	    } else if (attribute instanceof CouncellorDto) {
	        CouncellorDto counsellorDto = (CouncellorDto) attribute;
	        counsellorId = counsellorDto.getId();
	    } else {
	        model.addAttribute("emsg", "Invalid session data for counselor. Please log in again.");
	        return "redirect:/login";
	    }

	    // Retrieve the list of enquiries for the counselor
	    List<EnquiryDTO> enquiries = enquiryService.getEnquiries(counsellorId);

	    // Add enquiries to the model
	    model.addAttribute("enquiries", enquiries);

	    return "view-enquiries";
	}

	
	
	
	
	
	
	
	

}
