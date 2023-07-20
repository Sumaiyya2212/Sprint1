package com.tbs.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class AdminDTO {
	
	@NotNull(message="Name cannot be null")
	@NotBlank(message="Name is required")
	@Size(max=20, message="Maximum 20 characters allowed")
	@Size(min=2, message="Minimum 2 values required")
	private String name;
	
	@NotNull(message="Phone number cannot be null")
	@NotBlank(message="Phone number is required")
	@Pattern(regexp = "[6789]{1}[0-9]{9}$", message="Phone number should consist of 10 digits")
	private String contact;
}
