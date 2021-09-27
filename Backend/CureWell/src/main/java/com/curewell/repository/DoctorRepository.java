package com.curewell.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.curewell.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
	public Doctor findDoctorByDoctorId(int doctorId);
	public List<Doctor>findDoctorByDoctorName(String doctorName);
	public List<Doctor>findDoctorByDoctorSpecialisation(String doctorSpecialisation);
	public List<Doctor>findDoctorByCity(String City );
	public Doctor findDoctorByDoctorEmailIdAndDoctorPassword(String doctorEmailId,String doctorPassword);
}
