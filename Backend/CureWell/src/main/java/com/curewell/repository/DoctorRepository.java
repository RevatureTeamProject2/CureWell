package com.curewell.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.curewell.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
	Doctor findDoctorByDoctorId(int doctorId);
	List<Doctor>findDoctorByDoctorName(String doctorName);
	List<Doctor>findDoctorByDoctorSpecialisation(String doctorSpecialisation);
	List<Doctor>findDoctorByCity(String City );
	Doctor findDoctorByDoctorEmailIdAndDoctorPassword(String doctorEmailId,String doctorPassword);
}
