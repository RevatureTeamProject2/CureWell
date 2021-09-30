package com.curewell;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.curewell.model.Doctor;
import com.curewell.model.Patient;
import com.curewell.repository.PatientRepository;
import com.curewell.service.PatientService;


@SpringBootTest
class CureWellApplicationrPatientServiceTests {
	
	@Autowired
	private PatientService patientService;
	
	@MockBean
	private PatientRepository patientRepository;
	
	@Test
	public void getAllPatientTest() throws Exception
	{
		when(patientRepository.findAll()).thenReturn(Stream.of(new Patient(), new Patient()).collect(Collectors.toList()));
		assertEquals(2,patientService.getAllPatient().size());
	}
	
//	@Test
//	public void addPatientTest() throws Exception
//	{
//		Patient patient=new Patient();
//		when(patientRepository.save(patient)).thenReturn(patient);
//		assertEquals(patient,patientService.addPatient(patient));
//	}
	
	@Test
	public void getPatientByPatientNameTest() throws Exception
	{
		String name="Arpan Halder";
		when(patientRepository.findPatientByPatientName(name)).thenReturn(Stream.of(new Patient(),new Patient()).collect(Collectors.toList()));
		assertEquals(2,patientService.getPatientByPatientName(name).size());
	}
	
	@Test
	public void getPatientByPatientIdTest() throws Exception{
		int id=1;
		Patient patient=new Patient();
		when(patientRepository.findPatientByPatientId(id)).thenReturn(patient);
		assertEquals(patient,patientService.getPatientByPatientId(id));
	}
	
	@Test
	public void getPatientByPatientContactTest() throws Exception{
		long contact=112345678L;
		Patient patient=new Patient();
		when(patientRepository.findPatientBypatientContact(contact)).thenReturn(patient);
		assertEquals(patient,patientService.getPatientByPatientContact(contact));
	}
	
	@Test
	public void deletePatientByPatientEmailIdTest() throws Exception{
		String emailId="arpanhalder123345@gmai.com";
		Patient patient=new Patient();
		when(patientRepository.findPatientByPatientEmailId(emailId)).thenReturn(patient);
		assertEquals(patient,patientService.getPatientByPatientEmailId(emailId));
	}
	
	@Test
	public void findPatientByPatientEmailIdAndPatientPasswordTest() throws Exception{
		String emailId="arpanhalder123345@gmai.com";
		String password="sadad";
		Patient patient=new Patient();
		when(patientRepository.findPatientByPatientEmailIdAndPatientPassword(emailId,password)).thenReturn(patient);
		assertEquals(patient,patientService.findPatientByPatientEmailIdAndPatientPassword(emailId, password));
	}
	
//	@Test
//	public void getDoctorByIdTest() throws Exception{
//		int id=1;
//		Doctor doctor=new Doctor();
//		when(doctorRepository.findPatientByPatientEmailIdAndPatientPassword(emailId,password)).thenReturn(patient);
//		assertEquals(patient,patientService.findPatientByPatientEmailIdAndPatientPassword(emailId, password));
//	}
}
