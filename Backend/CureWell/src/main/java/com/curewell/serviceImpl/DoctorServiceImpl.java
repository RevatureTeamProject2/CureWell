package com.curewell.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.curewell.model.Doctor;
import com.curewell.repository.DoctorRepository;
import com.curewell.service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	DoctorRepository doctorRepository;

	@Override
	public boolean addDoctor(Doctor doctor) {
		// System.out.println("---add doctor - Service ---");
		doctorRepository.save(doctor);
		return true;
	}

	@Override
	public boolean deleteDoctor(int doctorId) {
		// System.out.println("---delete doctor service ---");
		doctorRepository.deleteById(doctorId);
		return true;
	}

	@Override
	public boolean updateDoctor(Doctor doctor) {
		// System.out.println("----- update doctor called -Service");
		doctorRepository.save(doctor);
		return true;
	}

	@Override
	public Doctor getDoctorById(int doctorId) {

		// System.out.println("----- doctor by id called -Service");
		Doctor doctorData = doctorRepository.findDoctorByDoctorId(doctorId);
		// Doctor doctor = doctorData.get();
		return doctorData;

	}

	@Override
	public List<Doctor> getDoctorByDoctorName(String doctorName) {

		return doctorRepository.findDoctorByDoctorName(doctorName);
	}

	@Override
	public List<Doctor> getAllDoctors() {
		return (List<Doctor>) doctorRepository.findAll();
	}

	@Override
	public boolean isDoctorExists() {
		List<Doctor> doctorList =doctorRepository.findAll();
		if(doctorList.size()==0) {
			return false;
		}
		return true;
	}

	@Override
	public List<Doctor> getDoctorSpecialisation(String doctorSpecialisation) {

		return doctorRepository.findDoctorByDoctorSpecialisation(doctorSpecialisation);
	}

	@Override
	public Doctor getDoctorEmailId(String emailId) {
		return doctorRepository.findDoctorByDoctorEmailId(emailId);
	}
	
	@Override
	public Doctor loginValidation(Doctor doctor) {
		return doctor;
	
    }
	@Override
	public Doctor getDoctorPassword(String Password) {
		
		return null;
	}
	
}
	
