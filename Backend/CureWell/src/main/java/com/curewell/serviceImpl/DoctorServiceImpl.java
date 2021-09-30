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
	public boolean addDoctor(Doctor doctor)  throws Exception{
		// System.out.println("---add doctor - Service ---");
		Doctor doctor2=null;
		doctor2=doctorRepository.save(doctor);
		if(doctor2==null) {
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteDoctor(int doctorId)  throws Exception {
		// System.out.println("---delete doctor service ---");
		doctorRepository.deleteById(doctorId);
		return true;
	}

	@Override
	public boolean updateDoctor(Doctor doctor) throws Exception{
		// System.out.println("----- update doctor called -Service");
		Doctor doctor2=null;
		doctor2=doctorRepository.save(doctor);
		if(doctor2==null) {
			return false;
		}
		return true;
	}

	@Override
	public Doctor getDoctorById(int doctorId) throws Exception {
		Doctor doctor2=null;
		doctor2=doctorRepository.findDoctorByDoctorId(doctorId);
		return doctor2;
	}

	@Override
	public List<Doctor> getDoctorByDoctorName(String doctorName) throws Exception {

		List<Doctor> doctors=null;
		doctors=doctorRepository.findDoctorByDoctorName(doctorName);
		if(doctors.size()==0)
		{
			return null;
		}
		return doctors;
	}

	@Override
	public List<Doctor> getAllDoctors() throws Exception {
		List<Doctor> doctors=null;
		doctors=doctorRepository.findAll();
		if(doctors.size()==0)
		{
			return null;
		}
		return doctors;
	}

	@Override
	public boolean isDoctorExists() throws Exception {
		List<Doctor> doctorData = doctorRepository.findAll();
		if (doctorData.size() != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<Doctor> getDoctorSpecialisation(String doctorSpecialisation) throws Exception {

		return doctorRepository.findDoctorByDoctorSpecialisation(doctorSpecialisation);
	}

	@Override
	public Doctor findDoctorFromEmailIdAndPassword(String emailId, String doctorPassword) throws Exception {
		Doctor doctor = null;
		doctor=doctorRepository.findDoctorByDoctorEmailIdAndDoctorPassword(emailId, doctorPassword);
		return doctor;
	}

	@Override
	public Doctor findDoctorByDoctorNameAndDoctorSpecialisation(String doctorName, String doctorSpecialisation) throws Exception {
		Doctor doctor = null;
		doctor=doctorRepository.findDoctorByDoctorNameAndDoctorSpecialisation(doctorName, doctorSpecialisation);
		return doctor;
	}
}
