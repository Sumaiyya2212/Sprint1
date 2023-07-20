package com.tbs.model;

import java.time.LocalDate;

import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.tbs.entity.Passenger;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TicketBookingDTO {
	
	
	private int ticketId;
	
	@NotNull(message="Number of Passenger cannot be null")
	private int noOfPassenger;
	
	private float totalFare;
	private final LocalDate bookingDate = LocalDate.now();
	
	@NotNull(message="Destination cannot be null")
	@Size(max=20, message="Maximum 20 characters allowed")
	@Size(min=2, message="Minimum 2 values required")
	private String destination;
	
	@NotNull(message="Destination cannot be null")
	@Size(max=20, message="Maximum 20 characters allowed")
	@Size(min=2, message="Minimum 2 values required")
	private String Source;
	
	@OneToOne
	private Passenger passenger;
	@OneToOne
	private FlightDTO flight;
	@OneToOne
	private AirlineDTO airline;
	
}
