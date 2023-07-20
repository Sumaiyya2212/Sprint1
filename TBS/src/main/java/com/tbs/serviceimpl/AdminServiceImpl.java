package com.tbs.serviceimpl;

import javax.persistence.Converter;

import org.springframework.beans.factory.annotation.Autowired;

import com.ems.entity.Employee;
import com.ems.exceptions.ResourceNotFoundException;
import com.tbs.entity.Admin;
import com.tbs.model.AdminDTO;
import com.tbs.repository.AdminRepository;
import com.tbs.service.AdminService;

public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository adminRepository;
	
	@Override
	public void saveAdmin(Admin ad) {
		// TODO Auto-generated method stub
		
	}
   
	@Override
	public boolean login(String Username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AdminDTO getAdminById(int id) {
		Admin ad = adminRepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Employee", "Id", id));
		return Converter.convertToAdminDTO(ad);
	}

	@Override
	public AdminDTO updateAdminById(int id, Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAdmin(int id) {
		// TODO Auto-generated method stub
		
	}
    
	
}
