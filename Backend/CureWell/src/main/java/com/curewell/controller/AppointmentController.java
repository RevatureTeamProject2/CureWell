package com.curewell.controller;
import java.util.List;


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
public class AppointmentController {
	
	@Autowired
	AppointmentService appointmentService;
	
	@PostMapping("/appointment")
	public boolean addAppointment(@RequestBody Appointment appointment) {
		
		return appointmentService.addAppointment(appointment);
	}
	
	@DeleteMapping("/appointment/{appointmentId}")
	public boolean deleteAppointment(@PathVariable int appointmentId) {
		return appointmentService.deleteAppointment(appointmentId);
	}
	
	@PutMapping("/appointment")
	public boolean updatePlayer(@RequestBody Appointment appointment) {
		return appointmentService.updateAppointment(appointment);
	}
	
	
	@GetMapping("/appointments")
	public List<Appointment> getAppointments()
	{
		List<Appointment> appointmentList=null;
		appointmentList = appointmentService.getAllAppointments();
	return appointmentList;
	}
	
	@GetMapping("/getbydate/{date}")
	public List<Appointment> getByDateAndTime(@PathVariable String date)
	{
		return appointmentService.getAppointmentForDay(date);
	}

}
