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
	public boolean addClinicCenter(ClinicCenter clinicCenter)  throws Exception{
		ClinicCenter clinicCenter2=null;
		clinicCenter2=clinicCenterRepository.save(clinicCenter);
		if(clinicCenter2==null)
		{
			return false;
		}
		return true;

	}

	@Override
	public boolean deleteClinicCenter(int id)  throws Exception{
		clinicCenterRepository.deleteById(id);
		return true;
	}

	@Override
	public boolean updateClinicCenter(ClinicCenter clinicCenter)  throws Exception{
		ClinicCenter clinicCenter2=null;
		clinicCenter2=clinicCenterRepository.save(clinicCenter);
		if(clinicCenter2==null)
		{
			return false;
		}
		return true;
	}


	@Override
	public List<ClinicCenter> getAllClinicCenters()  throws Exception{
		List<ClinicCenter> clinicCenters=null;
		clinicCenters=clinicCenterRepository.findAll();
		if(clinicCenters.size()==0) {
			return null;
		}
		return clinicCenters;
	}

	@Override
	public ClinicCenter getClinicCenterById(int id)  throws Exception{
		ClinicCenter clinicCenter =null;
		clinicCenter=clinicCenterRepository.findById(id);
		if(clinicCenter==null)
		{
			return null;
		}
		return clinicCenter;
	}

	@Override
	public List<ClinicCenter> getClinicCenterByName(String name)  throws Exception{
		List<ClinicCenter> clinicCenters=null;
		clinicCenters=clinicCenterRepository.findByName(name);
		if(clinicCenters.size()==0) {
			return null;
		}
		return clinicCenters;
	}

	@Override
	public List<ClinicCenter> getClinicCenterByCity(String city)  throws Exception{
		List<ClinicCenter> clinicCenters=null;
		clinicCenters= clinicCenterRepository.findByCity(city);
		if(clinicCenters.size()==0) {
			return null;
		}
		return clinicCenters;
	}


}
