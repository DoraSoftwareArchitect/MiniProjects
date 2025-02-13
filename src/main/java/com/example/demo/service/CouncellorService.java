package com.example.demo.service;

import java.util.List;

import com.example.demo.bindings.CouncellorDto;
import com.example.demo.bindings.DashBoardResponseDTO;
import com.example.demo.bindings.EnquiryDTO;
import com.example.demo.bindings.EnquiryFilterDto;

public interface CouncellorService {

	// for valid return id for invalid return zero.
	public CouncellorDto logIn(CouncellorDto councellorDTO); // Here we have taken the boolean method to check the data
																// of the login credentials based the verification
																// sucess we can login for the implementation we are
																// doing this method.
	// The above method is validating to capture the form data.

	public boolean uniqueEmailCheck(String email);

	// Here in the above method if the unique return true or else return false.

	public boolean register(CouncellorDto councellorDto);


	
	
	
	
	
	
	
	
	
	
	
	

}
