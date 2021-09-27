package com.curewell.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="doctor")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int doctorId;
	@Column(nullable = false,unique = true)
	private String doctorEmailId;
	private long contactNo;
	private String doctorName;
	private String doctorSpecialisation;
	@Column(nullable = false)
	private String doctorPassword;
	private String city;
}
