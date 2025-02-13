package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.bindings.CouncellorDto;
import com.example.demo.bindings.DashBoardResponseDTO;
import com.example.demo.repositories.CouncellorRepo;
import com.example.demo.service.CouncellorService;
import com.example.demo.service.EnquiryService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class CouncellorController {
	
	CouncellorController(){
		System.out.println("Default constructor");
	}

	@Autowired
	private CouncellorService councellorService;
	
	
	@Autowired
	private EnquiryService enquiryService;

	@GetMapping("/")
	public String index(Model model) {
		CouncellorDto cdto = new CouncellorDto();
		model.addAttribute("councellor", cdto);
		return "index";
	}

	@GetMapping("/logout")
	public String logOut(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession(false);
		session.invalidate();
		
		
		CouncellorDto cdto = new CouncellorDto();
		model.addAttribute("councellor", cdto);
		return "index";
	}
	
	
	
	
	

	@PostMapping("/login")
	public String handleLogIn(HttpServletRequest request, @ModelAttribute("councellor") CouncellorDto councellor,
			Model model) {
		CouncellorDto councellorDto = councellorService.logIn(councellor);

		if (councellorDto == null) {
			model.addAttribute("emsg", "Invalid credentials please give the correct email and password or Else Register Here");
//			model.addAttribute("emsg", "Please Register the account .....");

			
			CouncellorDto cdto=new CouncellorDto();
			
			model.addAttribute("councellor",cdto);
			model.addAttribute("emsg","Invalid Credentials");
			
			return "index";
		} else {
			Integer councellorId = councellorDto.getId();
			
			HttpSession session = request.getSession(true);
			session.setAttribute("councellorId", councellorDto);
			
			
			DashBoardResponseDTO dashboardDto=enquiryService.getDashBoardInfo(councellorId);


			// Assume this is where you fetch dashboard info
		//	model.addAttribute("smsg", "Your log in sucessfull");
			model.addAttribute("dashboardDto", dashboardDto);

			

		}
//		return "register";
		
		return "dashboardd";

	}
	
	
	
	
	

	@GetMapping("/register")
	public String registerPage(Model model) {

		CouncellorDto dto = new CouncellorDto();
		model.addAttribute("councellor", dto);

		return "register";

	}

	// This model attribute will get the data in the field of binding ....

	@PostMapping("/register")
	public String handleRegister(@ModelAttribute("councellor") CouncellorDto councellorDto, Model model) {

		boolean uniqueEmailCheck = councellorService.uniqueEmailCheck(councellorDto.getEmail());

		if (uniqueEmailCheck) {

			boolean register = councellorService.register(councellorDto);

			if (register) {
				model.addAttribute("smsg", "Registration got sucessfull");
				//return "register";

			}

			else {
				model.addAttribute("emsg", "Registration failed due to invalid credentials....");
				
			//	return "index";
			}

		} else {
			model.addAttribute("emsg", "Please Enter Unique Email Id");
		}
		return "register";

	}

}
