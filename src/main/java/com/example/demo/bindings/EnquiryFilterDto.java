package com.example.demo.bindings;

import lombok.Data;

@Data // UI to the controller and the controller to the UI these data we are using.
public class EnquiryFilterDto {

	private String classMode;
	private String course;
	private String enqStatus;

}
