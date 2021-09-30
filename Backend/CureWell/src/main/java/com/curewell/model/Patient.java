package com.curewell.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
@Entity
@Table(name="patient")
public class Patient {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patientId;
	@Column(unique = true)
	private String patientEmailId;
	private String patientName;
	private long patientContact;	
	private String patientAddress;	
	private String patientGender;	
	private int patientAge;
	private String patientGuardian;	
	private long guardianContact;
	private String patientPassword;
	
}
