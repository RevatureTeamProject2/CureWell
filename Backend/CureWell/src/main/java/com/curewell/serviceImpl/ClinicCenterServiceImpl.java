package com.curewell.serviceImpl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.curewell.model.ClinicCenter;
import com.curewell.model.Doctor;
import com.curewell.repository.ClinicCenterRepository;
import com.curewell.service.ClinicCenterService;

@Service
public class ClinicCenterServiceImpl implements ClinicCenterService{
	
	@Autowired
	ClinicCenterRepository clinicCenterRepository;
	
	@Override
	public boolean addClinicCenter(ClinicCenter clinicCenter) {
		clinicCenterRepository.save(clinicCenter);
		return true;
		
	}

	@Override
	public boolean deleteClinicCenter(int id) {
		clinicCenterRepository.deleteById(id);
		return true;
	}

	@Override
	public boolean updateClinicCenter(ClinicCenter clinicCenter) {
		clinicCenterRepository.save(clinicCenter);
		return true;
	}


	@Override
	public List<ClinicCenter> getAllClinicCenters() {
		return (List<ClinicCenter>) clinicCenterRepository.findAll();
	}

	@Override
	public ClinicCenter getClinicCenterById(int id) {
		ClinicCenter clinicCenter = clinicCenterRepository.findById(id);
		//ClinicCenter clinicCenter = ClinicCenterData.get();
		return clinicCenter;
	}

	@Override
	public List<ClinicCenter> getClinicCenterByName(String name) {
		
		return clinicCenterRepository.findByName(name);
	}

	@Override
	public List<ClinicCenter> getClinicCenterByCity(String city) {
		return clinicCenterRepository.findByCity(city);
		
	}
	

}
