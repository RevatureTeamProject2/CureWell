package com.curewell.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.curewell.model.Doctor;

public interface DoctorService {
	boolean addDoctor(Doctor doctor);
	boolean deleteDoctor(int doctorId);
	boolean updateDoctor(Doctor doctor);
	Doctor getDoctorById(int doctorId);
	List<Doctor> getDoctorByDoctorName(String doctorName);
	List<Doctor> getDoctorSpecialisation(String doctorSpecialisation);
	List<Doctor> getAllDoctors();
	boolean isDoctorExists();
	Doctor findDoctorFromEmailIdAndPassword(String emailId,String doctorPassword);
}
