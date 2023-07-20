package com.tbs.service;


import com.tbs.entity.Admin;
import com.tbs.model.AdminDTO;

public interface AdminService {
	
	void saveAdmin(Admin ad);
	boolean login(String Username,String password);
	AdminDTO getAdminById(int id);
	AdminDTO updateAdminById(int id,Admin admin);
	void deleteAdmin(int id);
	
	
	

}
