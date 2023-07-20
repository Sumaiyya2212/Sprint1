package com.tbs.service;

import java.util.List;

import com.ems.entity.Employee;
import com.ems.model.EmployeeDTO;
import com.tbs.entity.Passenger;
import com.tbs.model.PassengerDTO;

public interface PassengerService {

	//this method is used to save Passenger details
		PassengerDTO savePassenger(Passenger passenger);
		//method used to fetch all Passenger details
		List<PassengerDTO> getAllPassengerDetails();
		//method used to update employee details using employee id
		PassengerDTO updatepassByName(String name, Employee emp);
		//method used to delete employee details using employee id
		void deletepassName(String name);
		//method used to delete all employee details
		void deleteAllPassenger();
}
