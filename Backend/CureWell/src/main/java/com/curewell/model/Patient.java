package com.curewell.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="patient")
public class Patient {
	@GeneratedValue
	@Id	
	private int patientId;	
	private String patientName;	
	private String patientContact;	
	private String patientAddress;	
	private String patientGender;	
	private int patientAge;
	private String patientGaurdian;	
	private String gaurdianContact;	
	private String patientPassword;
}
