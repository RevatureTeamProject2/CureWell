package com.curewell.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.curewell.model.Doctor;
import com.curewell.service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired
	DoctorService doctorService;

	@PostMapping("/add")
	public boolean addDoctor(@RequestBody Doctor doctor) {
		
		return doctorService.addDoctor(doctor);
	}
	
	@DeleteMapping("/deletebyid/{doctorId}")
	public boolean deleteDoctor(@PathVariable int doctorId) {
		return doctorService.deleteDoctor(doctorId);
	}

	@PutMapping("/update")
	public boolean updateDoctor(@RequestBody Doctor doctor) {
		return doctorService.updateDoctor(doctor);
	}
	
	@GetMapping("/getall")
	public List<Doctor> getAllDoctors()
	{
		List<Doctor> doctorList=null;
		doctorList = doctorService.getAllDoctors();
	    return doctorList;
	}
	
	@GetMapping("/getbyid/{doctorId}")
	public Doctor getDoctorById(@PathVariable int doctorId)
	{
		return doctorService.getDoctorById(doctorId);
	}

	@GetMapping("/getbyname/{doctorName}")
	public List<Doctor> getDoctorByDoctorName(@PathVariable String doctorName)
	{
		return doctorService.getDoctorByDoctorName(doctorName);
	
	}
	
	@GetMapping("/getbyspecialisation/{doctorSpecialisation}")
	public List<Doctor> getDoctorBySpecialisation(@PathVariable String doctorSpecialisation)
	{
		return doctorService.getDoctorSpecialisation(doctorSpecialisation);
		
	}
	
	@GetMapping("/ifexists")
	public boolean isDoctorExists() {
	return doctorService.isDoctorExists();
	}
	
	@PostMapping("/login")
	public Doctor doctorLogin(@RequestBody Doctor doctor) {
		Doctor doctor2=null;
		doctor2=doctorService.findDoctorFromEmailIdAndPassword(doctor.getDoctorEmailId(),doctor.getDoctorPassword());
		if(doctor2==null)
		{
			throw new NoSuchElementException();
		}
		return doctor2;
	}
}