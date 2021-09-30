package com.curewell;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import com.curewell.repository.DoctorRepository;
import com.curewell.model.Doctor;
import com.curewell.service.DoctorService;


@SpringBootTest
public class CureWellApplicationrDoctorServiceTests {
	@Autowired
	private DoctorService doctorService;
	
	@MockBean
	public DoctorRepository doctorRepository;
	
	@Test
	public void getAllDoctorsTest() throws Exception
	{
		when(doctorRepository.findAll()).thenReturn(Stream.of(new Doctor(), new Doctor()).collect(Collectors.toList()));
		assertEquals(2,doctorService.getAllDoctors().size());
	}
	
	@Test
	public void getDoctorByDoctorNameTest() throws Exception
	{
		String name="Arpan Halder";
		when(doctorRepository.findDoctorByDoctorName(name)).thenReturn(Stream.of(new Doctor(),new Doctor()).collect(Collectors.toList()));
		assertEquals(2,doctorService.getDoctorByDoctorName(name).size());
	}
	
	@Test
	public void getDoctorIdTest() throws Exception{
		int id=1;
		Doctor doctor=new Doctor();
		when(doctorRepository.findDoctorByDoctorId(id)).thenReturn(doctor);
		assertEquals(doctor,doctorService.getDoctorById(id));
	}
	
	@Test
	public void getDoctorSpecialisationTest() throws Exception
	{
		String specialisation="Dermatologist";
		when(doctorRepository.findDoctorByDoctorSpecialisation(specialisation)).thenReturn(Stream.of(new Doctor(),new Doctor()).collect(Collectors.toList()));
		assertEquals(2,doctorService.getDoctorSpecialisation(specialisation).size());
	}
	
	@Test
	public void findDoctorFromEmailIdAndPasswordTest() throws Exception{
		String emailId="arpanhalder123345@gmai.com";
		String password="sadad";
		Doctor doctor=new Doctor();
		when(doctorRepository.findDoctorByDoctorEmailIdAndDoctorPassword(emailId, password)).thenReturn(doctor);
		assertEquals(doctor,doctorService.findDoctorFromEmailIdAndPassword(emailId, password));
	}
	
	@Test
	public void findDoctorByDoctorNameAndDoctorSpecialisationTest() throws Exception{
		String doctorName="Arpan Halder";
		String specialisation="Dermatologist";
		Doctor doctor=new Doctor();
		when(doctorRepository.findDoctorByDoctorNameAndDoctorSpecialisation(doctorName, specialisation)).thenReturn(doctor);
		assertEquals(doctor,doctorService.findDoctorByDoctorNameAndDoctorSpecialisation(doctorName, specialisation));
	}
}
