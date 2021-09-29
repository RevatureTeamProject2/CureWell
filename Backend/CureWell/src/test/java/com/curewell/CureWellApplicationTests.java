package com.curewell;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.internal.verification.Times;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.curewell.model.Patient;
import com.curewell.repository.PatientRepository;
import com.curewell.service.PatientService;

@SpringBootTest
public class CureWellApplicationTests {

	@Autowired
	private PatientService patientService;
	@MockBean
	private PatientRepository patientRepository;
	
	
	@Test
	public void getAllPatientTest() throws Exception{
		when(patientRepository.findAll()).thenReturn(Stream.of(new Patient(1,"vishwa@gmail.com","vishwa",9876546321L,"warangal","male",23,"manisha",9876554321L,"vishwa2")).collect(Collectors.toList()));
		assertEquals(1,patientService.getAllPatient().size());	
		}
	
	@Test
	public void getPatientByPatientEmailIdTest() throws Exception{
		String patientEmailId="manisha@gmail.com";
		when(patientRepository.findPatientByPatientEmailId(patientEmailId)).thenReturn(Stream.of(new Patient(10, "sai@gmail.com", "sai", 8787504123L, "Hyd", "Male", 21, "Ramu", 8798475632L, "ramu12")));
		assertEquals(1,patientService.getPatientByPatientEmailId(patientEmailId).size());	
		}
	
//	@Test
//	public void addPatientTest() throws Exception{
//		Patient patient=new Patient(1,"vishwa@gmail.com","vishwa",9876546321L,"warangal","male",23,"manisha",9876554321L,"vishwa2");
//		when(patientRepository.save(patient)).thenReturn(patient);
//		assertEquals(patient,patientService.addPatient(patient));	
//		}
//
//	@Test
//	public void deletePatientByPatientIdTest(int patientId) throws Exception{
//		Patient patient=new Patient(1,"vishwa@gmail.com","vishwa",9876546321L,"warangal","male",23,"manisha",9876554321L,"vishwa2");
//		patientService.deletePatientByPatientId(patientId);
//		verify(patientRepository,times(1)).delete(patient);
//		}
}








