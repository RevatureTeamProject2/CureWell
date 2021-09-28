package com.curewell.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curewell.exception.DoctorAddingException;
import com.curewell.exception.InvaliInputException;
import com.curewell.exception.InvalidLoginException;
import com.curewell.exception.NoDcotorFoundException;
import com.curewell.exception.NoDoctorBySpecialisationException;
import com.curewell.model.Doctor;
import com.curewell.service.DoctorService;

@RestController
@RequestMapping("doctor")
@CrossOrigin(origins = "http://localhost:4200")
public class DoctorController {
	
	@Autowired
	DoctorService doctorService;

	@PostMapping("/add")
	public boolean addDoctor(@RequestBody Doctor doctor)  throws Exception{
		
		boolean flag=false;
		flag=doctorService.addDoctor(doctor);
		if(flag==false) {
			throw new DoctorAddingException();
		}
		return flag;
	}
	
	@DeleteMapping("/deletebyid/{doctorId}")
	public boolean deleteDoctor(@PathVariable int doctorId)  throws Exception{
		if(doctorService.getDoctorById(doctorId)==null)
		{
			throw new NoSuchElementException();
		}
		return doctorService.deleteDoctor(doctorId);
	}

	@PutMapping("/update")
	public boolean updateDoctor(@RequestBody Doctor doctor)  throws Exception{
		boolean flag=false;
		flag=doctorService.updateDoctor(doctor);
		if(flag==false)
		{
			throw new InvaliInputException();
		}
		return flag;
	}
	
	@GetMapping("/getall")
	public List<Doctor> getAllDoctors() throws Exception
	{
		List<Doctor> doctorList=null;
		doctorList = doctorService.getAllDoctors();
		if(doctorList.size()==0)
		{
			throw new NoDcotorFoundException();
		}
	    return doctorList;
	}
	
	@GetMapping("/getbyid/{doctorId}")
	public Doctor getDoctorById(@PathVariable int doctorId)  throws Exception
	{
		if(doctorService.getDoctorById(doctorId)==null)
		{
			throw new NoSuchElementException();
		}
		return doctorService.getDoctorById(doctorId);
	}

	@GetMapping("/getbyname/{doctorName}")
	public List<Doctor> getDoctorByDoctorName(@PathVariable String doctorName) throws Exception
	{
		if(doctorService.getDoctorByDoctorName(doctorName)==null)
		{
			throw new NoSuchElementException();
		}
		return doctorService.getDoctorByDoctorName(doctorName);
	
	}
	
	@GetMapping("/getbyspecialisation/{doctorSpecialisation}")
	public List<Doctor> getDoctorBySpecialisation(@PathVariable String doctorSpecialisation) throws Exception
	{
		List<Doctor> doctors= doctorService.getDoctorSpecialisation(doctorSpecialisation);
		if(doctors.size()==0)
		{
			throw new NoDoctorBySpecialisationException();
		}
		return doctors;
	}
	
	@GetMapping("/ifexists")
	public boolean isDoctorExists() throws Exception {
	boolean flag=false;
	flag=doctorService.isDoctorExists();
	if(flag==false)
	{
		throw new NoDcotorFoundException();
	}
	return flag;
	}
	
	@PostMapping("/login")
	public Doctor doctorLogin(@RequestBody Doctor doctor)  throws Exception{
		Doctor doctor2=null;
		doctor2=doctorService.findDoctorFromEmailIdAndPassword(doctor.getDoctorEmailId(),doctor.getDoctorPassword());
		if(doctor2==null)
		{
			throw new InvalidLoginException("EmailID and Password is not valid.");
		}
		return doctor2;
	}
}