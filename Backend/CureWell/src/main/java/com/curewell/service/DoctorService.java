package com.curewell.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.curewell.model.Doctor;

public interface DoctorService {
	boolean addDoctor(Doctor doctor) throws Exception;
	boolean deleteDoctor(int doctorId) throws Exception;
	boolean updateDoctor(Doctor doctor) throws Exception;
	Doctor getDoctorById(int doctorId) throws Exception;
	List<Doctor> getDoctorByDoctorName(String doctorName) throws Exception;
	List<Doctor> getDoctorSpecialisation(String doctorSpecialisation) throws Exception;
	List<Doctor> getAllDoctors() throws Exception;
	boolean isDoctorExists() throws Exception;
	Doctor findDoctorFromEmailIdAndPassword(String emailId,String doctorPassword) throws Exception;
	Doctor findDoctorByDoctorNameAndDoctorSpecialisation(String doctorName,String doctorSpecialisation) throws Exception;
}
