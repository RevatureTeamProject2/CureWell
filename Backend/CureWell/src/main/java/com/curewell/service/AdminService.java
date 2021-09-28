package com.curewell.service;

import java.util.List;
import com.curewell.model.Admin;

public interface AdminService {
	
    boolean addAdmin(Admin admin);
	boolean deleteAdmin(int adminId);
	boolean updateAdmin(Admin admin);
	Admin getAdminById(int adminId);
	List<Admin> getAdminByName(String adminName);
	List<Admin> getAllAdmin();
	boolean isAdminExists(int adminId);

}

