package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.example.demo.academy.academydetails;

@Repository
public interface detailsrepo extends JpaRepository<academydetails,String>{

	@Query("select u from academydetails u where u.danceType=:a")
	public List<academydetails> getallacademiesname(@Param("a") String name);

}
