package com.curewell.service;

import java.util.List;
import com.curewell.model.ClinicCenter;

public interface ClinicCenterService {
	boolean addClinicCenter(ClinicCenter clinicCenter) throws Exception;
	boolean deleteClinicCenter(int id) throws Exception;
	boolean updateClinicCenter(ClinicCenter clinicCenter) throws Exception;
	List<ClinicCenter> getAllClinicCenters() throws Exception; 
	ClinicCenter getClinicCenterById(int id) throws Exception;
	List<ClinicCenter> getClinicCenterByName(String name) throws Exception;
	List<ClinicCenter> getClinicCenterByCity(String city) throws Exception;
}
