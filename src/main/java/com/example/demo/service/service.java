package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.academy.academydetails;
import com.example.demo.repository.detailsrepo;

@Service
public class service {

	@Autowired
	detailsrepo  repo;
		

		public String updateDetails(academydetails c) {
			repo.save(c);
			return "updated";
		}

		public String deleteDetails(String name) {
			repo.deleteById(name);
			return "academy deleted";
		}
		
		public List<academydetails> getallacademiesname(String n){
			return repo.getallacademiesname(n);
			}
}
