package com.curewell.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.curewell.model.Doctor;

public interface DoctorService {
	public boolean addDoctor(Doctor doctor);
	public boolean deleteDoctor(int doctorId);
	public boolean updateDoctor(Doctor doctor);
	public Doctor getDoctorById(int doctorId);
	public List<Doctor> getDoctorByDoctorName(String doctorName);
	public List<Doctor> getDoctorSpecialisation(String doctorSpecialisation);
	public List<Doctor> getAllDoctors();
	public boolean isDoctorExists();
	public Doctor findDoctorFromEmailIdAndPassword(String emailId,String doctorPassword);
}
