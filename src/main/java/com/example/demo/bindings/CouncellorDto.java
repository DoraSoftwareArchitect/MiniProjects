package com.example.demo.bindings;

import lombok.Data;

// Here this data will use for login form binding registration form binding.

@Data

public class CouncellorDto {
 
	private Integer id;
	private String name;
	private String email;
	private String pwd;
	private String phno;

}
