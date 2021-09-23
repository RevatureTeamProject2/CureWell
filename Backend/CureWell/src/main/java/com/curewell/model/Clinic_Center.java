package com.curewell.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "clinic_center")
public class Clinic_Center {
	@GeneratedValue
	@Id
	int clinicId;
	String clinicCenter;
}
