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
	public boolean addAppointment(Appointment appointment) throws Exception{
	//System.out.println("----add appointment-------");
	Appointment appointment2=null;
	appointment2=appointmentRepository.save(appointment);
	if(appointment2!=null) {
		return true;
	}
	return false;
	}

	@Override
	public boolean deleteAppointment(int appointmentId) throws Exception{
		appointmentRepository.deleteById(appointmentId);
		return true;
		
	}

	@Override
	public boolean updateAppointment(Appointment appointment) throws Exception{
		Appointment appointment2=null;
		appointment2=appointmentRepository.save(appointment);
		if(appointment2!=null) {
			return true;
		}
		return false;
	}

	
	@Override public List<Appointment> getAllAppointments() throws Exception
	{
		List<Appointment> appointments=null;
		appointments=appointmentRepository.findAll();
		if(appointments.size()==0)
		{
			return null;
		}
		return appointments;
	}

	
	@Override
	public boolean isAppointmentExists() throws Exception{
		if(appointmentRepository.findAll().size()==0) {
			return true;
		}
		return false;
	}
	

	@Override
	public List<Appointment> getAppointmentForDay(String date) {
		
		List<Appointment> listAppointment=null;
		listAppointment=appointmentRepository.findByDate(date);
		if(listAppointment.size()==0)
		{
			return null;
		}
		return listAppointment;
	}
	  
		
}