package com.tbs.model;

import java.util.List;

import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.tbs.entity.Flight;

public class AirlineDTO {
	
	private int airlineId;
	
	@NotNull(message="Airlinename cannot be null")
	@NotBlank(message="Airlinename is required")
	@Size(max=20, message="Maximum 20 characters allowed")
	@Size(min=2, message="Minimum 2 values required")
	private String airlineName;
	
	@OneToMany
	private List<Flight>flights;

}
