package com.curewell.controller;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curewell.model.Appointment;
import com.curewell.service.AppointmentService;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
	
	@Autowired
	AppointmentService appointmentService;
	
	@PostMapping("/add")
	public boolean addAppointment(@RequestBody Appointment appointment) {
		
		return appointmentService.addAppointment(appointment);
	}
	
	@DeleteMapping("/deletebyid/{appointmentId}")
	public boolean deleteAppointment(@PathVariable int appointmentId) throws Exception {
		boolean flag= appointmentService.deleteAppointment(appointmentId);
		if(flag==false) {
			throw new NoSuchElementException();
		}
		return flag;
	}
	
	@PutMapping("/update")
	public boolean updateAppointment(@RequestBody Appointment appointment) {
		return appointmentService.updateAppointment(appointment);
	}
	
	
	@GetMapping("/getall")
	public List<Appointment> getAppointments() throws Exception
	{
		List<Appointment> appointmentList=null;
		appointmentList = appointmentService.getAllAppointments();
		if(appointmentList==null)
		{
			throw new NoSuchElementException();
		}
		return appointmentList;
	}
	
	@GetMapping("/getbydate/{date}")
	public List<Appointment> getByDateAndTime(@PathVariable String date) throws Exception
	{
		List<Appointment> appointmentList=null;
		appointmentList = appointmentService.getAppointmentForDay(date);
		if(appointmentList.size()==0)
		{
			throw new NoSuchElementException();
		}
		return appointmentList;
	}

}
