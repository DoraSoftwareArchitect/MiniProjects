package com.example.demo.service;

import java.util.List;

import com.example.demo.bindings.DashBoardResponseDTO;
import com.example.demo.bindings.EnquiryDTO;
import com.example.demo.bindings.EnquiryFilterDto;

public interface EnquiryService {

	public DashBoardResponseDTO getDashBoardInfo(Integer councellorId);

	public boolean addEnquiry(EnquiryDTO enqDTO, Integer councellorId); // This method is for add enquiry .

	public List<EnquiryDTO> getEnquiries(Integer councellorId); // This method is used for displaying the data in the
																// form of Enquiry data in order to get the how many of
																// them enquired for the courses and it should be
																// displayed here.

	// Here in the above method we only need to fetch login enquries.

	public List<EnquiryDTO> getEnquiries(EnquiryFilterDto enquiryFilterDto, Integer councellorId); // This method is
																									// used for search
																									// button in the
																									// enquiry form
																									// which we can get
																									// all the data
																									// available.

	// In the above method we can observe method overloading same method with the 2
	// different parameters.

	public EnquiryDTO getEnquiryById(Integer enqId);

	// Here in the above the method by the help of this method we can able to edit
	// the data.

}
