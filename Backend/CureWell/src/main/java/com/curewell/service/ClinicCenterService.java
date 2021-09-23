package com.curewell.service;

import java.util.List;
import com.curewell.model.ClinicCenter;

public interface ClinicCenterService {
	public List<ClinicCenter> getAllClinicCenters(); 
	public ClinicCenter getClinicCenterById(int id);
	public List<ClinicCenter> getClinicCenterByName(String name);
	public List<ClinicCenter> getClinicCenterByCity(String city);
}
