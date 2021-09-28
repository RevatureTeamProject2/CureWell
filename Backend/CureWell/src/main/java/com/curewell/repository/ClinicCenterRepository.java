package com.curewell.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.curewell.model.ClinicCenter;

public interface ClinicCenterRepository extends JpaRepository<ClinicCenter, Integer> {
	ClinicCenter findById(int id);
	List<ClinicCenter>findByName(String name);
	List<ClinicCenter>findByCity(String city);
}
