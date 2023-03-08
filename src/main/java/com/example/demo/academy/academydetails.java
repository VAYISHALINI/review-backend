package com.example.demo.academy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class academydetails {
    @Id
	private String academyName;
	private String danceType;
	private Long fee;
	private String location;
	private Long contact;
	
	public String getAcademyName() {
		return academyName;
	}
	public academydetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void setAcademyName(String academyName) {
		this.academyName = academyName;
	}
	public String getDanceType() {
		return danceType;
	}
	public void setDanceType(String danceType) {
		this.danceType = danceType;
	}
	public Long getFee() {
		return fee;
	}
	public void setFee(Long fee) {
		this.fee = fee;
	}
	
	public academydetails(String academyName, String danceType, Long fee, String location, Long contact) {
		super();
		this.academyName = academyName;
		this.danceType = danceType;
		this.fee = fee;
		this.location = location;
		this.contact = contact;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
