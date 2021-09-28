package com.curewell.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name="doctor")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int doctorId;
	@Column(unique = true)
	@NotNull
	private String doctorEmailId;
	private long contactNo;
	private String doctorName;
	private String doctorSpecialisation;
	@NotNull
	private String doctorPassword;
	private String city;
}
