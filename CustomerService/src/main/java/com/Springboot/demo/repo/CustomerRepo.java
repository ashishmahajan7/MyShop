package com.Springboot.demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Springboot.demo.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
