package com.curewell.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "clinicCenter")
public class ClinicCenter {
	
	@Id
	@GeneratedValue
	int id;
	String name;
	String city;
}
