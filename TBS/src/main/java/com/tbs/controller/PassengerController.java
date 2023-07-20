package com.tbs.controller;

import java.util.List;

import javax.persistence.Converter;
import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tbs.entity.Passenger;
import com.tbs.model.PassengerDTO;
import com.tbs.service.PassengerService;

@RestController
public class PassengerController {

	
	@PostMapping("/savePassenger")
	public PassengerDTO savePassenger(@Valid @RequestBody PassengerDTO passDto)
	{
		final Passenger emp = Converter.convertTopassEntity(passDto);
		return PassengerService.savePassenger(passenger);
	}
	
	//build get employee details using id REST API
	@GetMapping("/getPassByname/{passname}")
	public PassengerDTO getAllPassengerDetail(@PathVariable("passname") String name)
	{
		return PassengerService.getAllPassengerDetails(passenger);
	}
	

	
}
