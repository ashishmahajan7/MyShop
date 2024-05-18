package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Admin;

public interface AdminService {

	public Admin saveAdmin(Admin admin);
	
	public List<Admin> getAllAdmin();
	
	public Optional<Admin> getAdminById(int id);
	
}
