package com.curewell.service;

import java.util.List;

import com.curewell.model.Appointment;

  
  public interface AppointmentService {
  
  //crud
  
  boolean addAppointment(Appointment appointment); 
  boolean deleteAppointment(int appointmentId);
  boolean updateAppointment(Appointment appointment);
  boolean isAppointmentExists(int appointmentId);

  //appointment functionalities 
  
  List<Appointment> getAllAppointments();
 
  List<Appointment> getAppointmentForDay(String date); 
  //public Map<String, Appointment>getAppointmentsForDay(Date day);
  
  
  }