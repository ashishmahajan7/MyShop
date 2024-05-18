package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public Admin saveAdmin(Admin admin) {
		Admin admin2 = adminRepository.save(admin);
		return admin2;
	}

	@Override
	public List<Admin> getAllAdmin() {
		List<Admin> adminList = (List<Admin>) adminRepository.findAll();
		return adminList;
	}

	@Override
	public Optional<Admin> getAdminById(int id) {
		Optional<Admin> admin = adminRepository.findById(id);
		return admin;
	}

}
