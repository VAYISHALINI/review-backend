package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.academy.academydetails;
import com.example.demo.repository.detailsrepo;
import com.example.demo.service.service;

@RestController
@CrossOrigin 
public class controller {

	@Autowired
	  detailsrepo repo;
	@Autowired
	   service ser;
	 
	 

	 @PostMapping("/post")
	  public academydetails create(@RequestBody academydetails c) {
		 return repo.save(c);
	 }
	 
	 
	 
	 @GetMapping("/getallusers/{name}")
	 public List<academydetails> getallacademiesname (@PathVariable String name){
		 return ser.getallacademiesname(name);
	 }
	 
	 
	 @PutMapping("/detail")
	 public String update(@RequestBody academydetails c) {
		 return ser.updateDetails(c);
	 }
	 
	 @DeleteMapping("/detail/{name}")
	 public String delete(@PathVariable String name) {
		 return ser.deleteDetails(name);
	 }
	 
}
