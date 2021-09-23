package com.curewell.repository;

import java.util.List;

import com.curewell.model.Appointment;

public interface AppointmentRepository {
	public List<Appointment>findByDate(String date);
	public List<Appointment>findByCenter(String centerName);
	public List<Appointment>findByDoctorName(String doctorName);
}
