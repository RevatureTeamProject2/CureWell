package com.curewell.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.curewell.model.Admin;
import com.curewell.model.Doctor;
import com.curewell.model.Patient;
import com.curewell.repository.AdminRepository;
import com.curewell.service.AdminService;


@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository adminRepository;
	
	
	@Override
	public boolean addAdmin(Admin admin) {
		adminRepository.save(admin);
		return true;
	}

	@Override
	public boolean deleteAdmin(int adminId) {
		adminRepository.deleteById(adminId);
		return true;
	}

	@Override
	public boolean updateAdmin(Admin admin) {
		adminRepository.save(admin);
		return true;
	}

	@Override
	public Admin getAdminById(int adminId) {
		Admin admin = adminRepository.findByAdminId(adminId);		
		return admin;
	}

	@Override
	public List<Admin> getAdminByName(String adminName) {
		return adminRepository.findByAdminName(adminName);
	}

	@Override
	public List<Admin> getAllAdmin() {
		return (List<Admin>) adminRepository.findAll();
	}

	@Override
	public boolean isAdminExists() {
		List<Admin> adminList = adminRepository.findAll();
		if(adminList.size()==0) {
			return false;
		}
		return true;
	}

}

