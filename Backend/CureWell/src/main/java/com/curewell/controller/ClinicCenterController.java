package com.curewell.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.curewell.model.ClinicCenter;
import com.curewell.service.ClinicCenterService;

@RestController
@RequestMapping("/clinicCenter")
public class ClinicCenterController {
	
	@Autowired
	ClinicCenterService clinicCenterService;

	@PostMapping("/add")
	public boolean addClinicCenter(@RequestBody ClinicCenter clinicCenter) {
		clinicCenterService.addClinicCenter(clinicCenter);
		return true;
	}

	@DeleteMapping("/deletebyid/{id}")
	public boolean deleteClinicCenter(@PathVariable int id) {
		clinicCenterService.deleteClinicCenter(id);
		return true;
	}

	@PutMapping("/updatebyid/{id}")
	public boolean updateClinicCenter(@RequestBody ClinicCenter clinicCenter) {
		clinicCenterService.updateClinicCenter(clinicCenter);
		return true;
	}

	@GetMapping("/getall")
	public List<ClinicCenter> getAllClinicCenters() {
		
		List<ClinicCenter> clinicCenterList=null;
		clinicCenterList = clinicCenterService.getAllClinicCenters();
	    return clinicCenterList;
	}

	@GetMapping("/getbyid/{id}")
	public ClinicCenter getClinicCenterById(@PathVariable int id) {
		
		return clinicCenterService.getClinicCenterById(id);
	}

	@GetMapping("/getbyname/{name}")
	public List<ClinicCenter> getClinicCenterByName(@PathVariable String name) {
		return clinicCenterService.getClinicCenterByName(name);
	}

	@GetMapping("/getbycity/{city}")
	public List<ClinicCenter> getClinicCenterByCity(@PathVariable String city) {
		return clinicCenterService.getClinicCenterByCity(city);
	}
	
}