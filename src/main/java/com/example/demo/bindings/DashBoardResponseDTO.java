package com.example.demo.bindings;

import lombok.Data;

// The purpose of this page is to send the data to the UI page.
// That object i will send from the controller to the UI.
// 	Data Transfer Object it is used to Transfer the data from the UI To the controller and the controller to the UI.
// These we can called as commanding Objects , POJO classes also.

@Data
public class DashBoardResponseDTO {

	private Integer totalEnqCount; 
	private Integer openEnquiryCount;
	private Integer enrolledEnquiryCount;
	private Integer lostEnquiryCount;

}
