package com.curewell.service;

import java.util.List;
import com.curewell.model.ClinicCenter;

public interface ClinicCenterService {
	boolean addClinicCenter(ClinicCenter clinicCenter);
	boolean deleteClinicCenter(int id);
	boolean updateClinicCenter(ClinicCenter clinicCenter);
	List<ClinicCenter> getAllClinicCenters(); 
	ClinicCenter getClinicCenterById(int id);
	List<ClinicCenter> getClinicCenterByName(String name);
	List<ClinicCenter> getClinicCenterByCity(String city);
}
