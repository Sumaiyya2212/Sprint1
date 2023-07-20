package com.tbs.model;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class FlightDTO {
      
	 private int flightId;
	 
	 @NotNull(message ="Available seats not be null")
	 private int availableseats;
	 
	 @NotNull(message ="Total seats can not be null")
	 private int totalseats;
	 
	 @NotNull(message ="Fare can not be null")
	 private float fare;
	 
	 private String time;
	 
	 private LocalDate date;
	 
	 @NotNull(message="Destination cannot be null")
	 @Size(max=20, message="Maximum 20 characters allowed")
	 @Size(min=2, message="Minimum 2 values required")
	 private String source;
	 
	 @NotNull(message="Destination cannot be null")
	 @Size(max=20, message="Maximum 20 characters allowed")
	 @Size(min=2, message="Minimum 2 values required")
	 private String destination;
}
