package com.curewell.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.curewell.model.Patient;
import com.curewell.repository.PatientRepository;

public class PatientDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private PatientRepository patientRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Patient patient=patientRepository.findPatientByPatientEmailId(username);
		if(patient==null) {
			throw new UsernameNotFoundException("Patient Email id Invalid");
		}
		CustomPatientDetails customPatientDetails=new CustomPatientDetails(patient);
		return customPatientDetails;
	}

}
