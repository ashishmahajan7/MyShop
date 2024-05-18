package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Admin;
import com.example.demo.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/saveadmin")
	public Admin saveAdmin(@RequestBody Admin admin) {
		Admin admin2 = adminService.saveAdmin(admin);
		return admin2;
	}
	
	@GetMapping("/getalladmin")
	public List<Admin> getAllAdmin(){
		List<Admin> adminList = adminService.getAllAdmin();
		return adminList;
	}
	
	@GetMapping("/getadmin/{id}")
	public Optional<Admin> getAdminById(@PathVariable int id){
		Optional<Admin> admin = adminService.getAdminById(id);
		return admin;
	}

}
