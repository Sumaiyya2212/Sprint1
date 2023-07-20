package com.tbs.serviceimpl;

import java.util.List;

import javax.persistence.Converter;

import org.springframework.beans.factory.annotation.Autowired;

import com.ems.entity.Employee;
import com.ems.entity.Role;
import com.ems.exceptions.PropertyAlreadyExistException;
import com.tbs.entity.Passenger;
import com.tbs.model.PassengerDTO;
import com.tbs.repository.PassengerRepository;
import com.tbs.repository.RoleRepository;
import com.tbs.service.PassengerService;

public class PassengerServiceImpl implements PassengerService {

	@Autowired
	PassengerRepository passRepository;
	@Autowired
	RoleRepository roleRepository;
	@Override
	public PassengerDTO savePassenger(Passenger passenger) {
		List<Passenger> passengers =passRepository.findAll();
		for(Passenger e: passengers)
		{
			if(e.getEmail().equals(passenger.getEmail()))
			{
				throw new PropertyAlreadyExistException("Email Already exists.");
			}
		}
		Role role = RoleRepository.findById().get(); //find the object using the id and get the object
		passenger.setRole(role); //setting the object to your passenger
		passRepository.save(); //save the passenger details
		return Converter.convertToPassDTO(passenger); //return employee details
	}

	@Override
	public List<PassengerDTO> getAllPassengerDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PassengerDTO updatepassByName(String name, Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletepassName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllPassenger() {
		// TODO Auto-generated method stub
		
	}
	

}
