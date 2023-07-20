package com.tbs.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TicketBooking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ticketId;
	
	@Column(nullable=false)
	private int noOfPassengers;
	
	@Column
	private float totalFare;
	
	@Column
	private final LocalDate bookingDate = LocalDate.now();
	
	@Column(length=30, nullable = false)
	private String source;
	
	@Column(length=30, nullable = false)
	private String destination;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Passenger passenger;
	
}
