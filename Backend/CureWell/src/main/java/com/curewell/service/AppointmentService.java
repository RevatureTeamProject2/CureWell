package com.curewell.service;

import java.util.List;

import com.curewell.model.Appointment;


public interface AppointmentService {

	boolean addAppointment(Appointment appointment) throws Exception; 
	boolean deleteAppointment(int appointmentId) throws Exception ;
	boolean updateAppointment(Appointment appointment) throws Exception;
	boolean isAppointmentExists() throws Exception;

	List<Appointment> getAllAppointments() throws Exception;
	List<Appointment> getAppointmentForDay(String date) throws Exception; 

}