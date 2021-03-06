package com.curewell.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.curewell.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
	List<Appointment>findByDate(String date);
}
