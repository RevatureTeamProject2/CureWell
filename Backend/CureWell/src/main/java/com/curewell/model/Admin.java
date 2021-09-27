package com.curewell.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="admin")
public class Admin {
	
	@Id
	@GeneratedValue
	private int adminId;
	private String adminName;	
	private String adminPassword;
}