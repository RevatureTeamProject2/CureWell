package com.curewell.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="doctor")
public class Doctor {
	
	@Id
	@GeneratedValue
	private int doctorId;
	private String doctorName;
	private String doctorSpecialisation;
	private String doctorPassword;
	private String city;
}
