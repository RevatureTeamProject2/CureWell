package com.curewell.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "appointment")
public class Appointment {
	@GeneratedValue
	@Id	
	private int appointmentId;
	private String patientName;	
	private String reasonToVisit;
	private String date;
	private String time;
	private int consultationFee;
	private String centerName;
}