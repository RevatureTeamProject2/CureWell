package com.curewell.service;

import java.util.List;

import com.curewell.model.Appointment;

  
  public interface AppointmentService {
  
  //crud
  
  public boolean addAppointment(Appointment appointment); 
  public boolean deleteAppointment(int appointmentId);
  public boolean updateAppointment(Appointment appointment);
  public boolean isAppointmentExists();

  //appointment functionalities 
  
  public List<Appointment> getAllAppointments();
 
  public List<Appointment> getAppointmentForDay(String date); 
  //public Map<String, Appointment>getAppointmentsForDay(Date day);
  
  
  }