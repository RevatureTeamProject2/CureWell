package com.curewell.repository;

import java.util.List;

import com.curewell.model.Doctor;

public interface DoctorRepository {
	public List<Doctor>findDoctorById(int doctorId);
	public List<Doctor>findDoctorByName(String doctorName);
	public List<Doctor>findDoctorBySpecialisation(String doctorSpecialisation);
	public List<Doctor>findDoctorByCity(String doctorSpecialisation);
}
