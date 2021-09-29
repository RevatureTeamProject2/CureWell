package com.curewell.advice;

import java.util.NoSuchElementException;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.curewell.exception.AppointmentBookingException;
import com.curewell.exception.ClinicAddingException;
import com.curewell.exception.DoctorAddingException;
import com.curewell.exception.InvaliInputException;
import com.curewell.exception.InvalidLoginException;
import com.curewell.exception.NoAppointmentFoundException;
import com.curewell.exception.NoClinicCenterFoundException;
import com.curewell.exception.NoDcotorFoundException;
import com.curewell.exception.NoDoctorBySpecialisationException;
import com.curewell.exception.NoPatientFoundException;
import com.curewell.exception.PatientAddingException;

@ControllerAdvice
public class MyControllerAdvice {
	
	@ExceptionHandler(InvaliInputException.class)
	public ResponseEntity<String> handleInvalidInputException(InvaliInputException elementException)
	{
		return new  ResponseEntity<String>("Please Enter valid Input..", HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNoSuchElementException (NoSuchElementException elementException)
	{
		return new  ResponseEntity<String>("Given Data is not valid.. Please try with some other data", HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(InvalidLoginException.class)
	public ResponseEntity<String> handleInvalidLoginException(InvalidLoginException elementException)
	{
		return new  ResponseEntity<String>("EmailId/Password is not Valid. Please try again....", HttpStatus.BAD_REQUEST);
	} 
	
	@ExceptionHandler(PatientAddingException.class)
	public ResponseEntity<String> handlePatientAddingException(PatientAddingException elementException)
	{
		return new  ResponseEntity<String>("Plaese Enter Correct data to add a patient..", HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoPatientFoundException.class)
	public ResponseEntity<String> handleNoPatientFoundException(NoPatientFoundException elementException)
	{
		return new  ResponseEntity<String>("No patient Available... Plaese add some patient..", HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoDcotorFoundException.class)
	public ResponseEntity<String> handleNoDcotorFoundException(NoDcotorFoundException elementException)
	{
		return new  ResponseEntity<String>("No Doctor Available... Plaese add some Doctor..", HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoDoctorBySpecialisationException.class)
	public ResponseEntity<String> handleNoDoctorBySpecialisationException(NoDoctorBySpecialisationException elementException)
	{
		return new  ResponseEntity<String>("No Doctor Available in this particular field... Plaese add some Doctor in this field..", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(DoctorAddingException.class)
	public ResponseEntity<String> handleDoctorAddingException(DoctorAddingException elementException)
	{
		return new  ResponseEntity<String>("Plaese Enter Correct data to add a doctor..", HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(ClinicAddingException.class)
	public ResponseEntity<String> handleClinicAddingException(ClinicAddingException elementException)
	{
		return new  ResponseEntity<String>("Plaese Enter Correct data to add a Clinic Center..", HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoClinicCenterFoundException.class)
	public ResponseEntity<String> handleNoClinicCenterFoundException(NoClinicCenterFoundException elementException)
	{
		return new  ResponseEntity<String>("Currently no clinic center available.. Please add some Clinic centers", HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(AppointmentBookingException.class)
	public ResponseEntity<String> handleAppointmentBookingException(AppointmentBookingException elementException)
	{
		return new  ResponseEntity<String>("Plaese Enter Correct data to book an Appointment..", HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoAppointmentFoundException.class)
	public ResponseEntity<String> handleNoAppointmentFoundException(NoAppointmentFoundException elementException)
	{
		return new  ResponseEntity<String>("You have not booked any appointment till now.", HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String> handleNullPointerException (NullPointerException elementException)
	{
		return new  ResponseEntity<String>("Null pointer Exception", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(EmptyResultDataAccessException.class)
	public ResponseEntity<String> handleEmptyResultDataAccessException (EmptyResultDataAccessException elementException)
	{
		return new  ResponseEntity<String>("No Such Value Present", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ResponseEntity<String> handleHttpMessageNotReadableException(HttpMessageNotReadableException elementException)
	{
		return new  ResponseEntity<String>("contact number should not be preceeded with 0 ", HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleAllExceptions(Exception elementException)
	{
		return new  ResponseEntity<String>("Exception has occured", HttpStatus.BAD_REQUEST);
	}
 
}
