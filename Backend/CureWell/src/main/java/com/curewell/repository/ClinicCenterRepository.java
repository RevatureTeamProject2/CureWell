package com.curewell.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.curewell.model.ClinicCenter;

public interface ClinicCenterRepository extends JpaRepository<ClinicCenter, Integer> {
	public ClinicCenter findById(int id);
	public List<ClinicCenter>findByName(String name);
	public List<ClinicCenter>findByCity(String city);
}
