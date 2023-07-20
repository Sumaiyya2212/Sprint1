package com.tbs.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Airline {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int airlineId;
	    
	    @Column(name="airline_name",length=30,nullable=false)
	    private String airlineName;
	    
	    @OneToMany
	    private List<Flight>flights;
}
