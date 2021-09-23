package com.curewell.repository;

import java.util.List;
import com.curewell.model.ClinicCenter;

public interface ClinicCenterRepository {
	public List<ClinicCenter>findById(int id);
	public List<ClinicCenter>findByName(String name);
	public List<ClinicCenter>findByCity(String city);
}
