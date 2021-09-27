package com.curewell.serviceImpl;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.curewell.repository.AppointmentRepository;
import com.curewell.service.AppointmentService;
import com.curewell.model.Appointment;
@Service
public class AppointmentServiceImpl implements AppointmentService {
	@Autowired
	AppointmentRepository appointmentRepository;
	  
	@Override
	public boolean addAppointment(Appointment appointment) {
	//System.out.println("----add appointment-------");
	appointmentRepository.save(appointment);
		return true;
	}

	@Override
	public boolean deleteAppointment(int appointmentId) {
		//System.out.println("--- delete appointment called - Service");
		appointmentRepository.deleteById(appointmentId);
		return true;
		
	}

	@Override
	public boolean updateAppointment(Appointment appointment) {
		//System.out.println("----- update appointment called -Service");
		appointmentRepository.save(appointment);
		return true;
	}

	
	@Override public List<Appointment> getAllAppointments()
	{
	  return(List<Appointment>)appointmentRepository.findAll();
	 }

	
	@Override
	public boolean isAppointmentExists(int appointmentId) {

		Optional<Appointment> patientData = appointmentRepository.findById(appointmentId);
		return patientData.isPresent();
	}
	

	@Override
	public List<Appointment> getAppointmentForDay(String date) {
		
		List<Appointment> listAppointment=null;
		listAppointment=appointmentRepository.findByDate(date);
		return listAppointment;
	}
	  
		
}