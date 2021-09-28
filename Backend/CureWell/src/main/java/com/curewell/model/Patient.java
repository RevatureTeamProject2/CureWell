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
@Table(name="patient")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patientId;
	@Column(nullable = false,unique = true)
	private String patientEmailId;
	@Column(nullable = false)
	private String patientName;
	private String patientContact;	
	private String patientAddress;	
	@Column(nullable = false)
	private String patientGender;	
	private int patientAge;
	private String patientGaurdian;	
	private String guardianContact;
	@Column(nullable = false)
	private String patientPassword;
}
