package com.curewell.serviceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.curewell.model.ClinicCenter;
import com.curewell.repository.ClinicCenterRepository;
import com.curewell.service.ClinicCenterService;

@Service
public class ClinicCenterServiceImpl implements ClinicCenterService{
	
	@Autowired
	ClinicCenterRepository cliniccenterrepository;

	@Override
	public List<ClinicCenter> getAllClinicCenters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClinicCenter getClinicCenterById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClinicCenter> getClinicCenterByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClinicCenter> getClinicCenterByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
