package com.curewell.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.curewell.model.Admin;
import com.curewell.model.Doctor;

public interface AdminRepository extends JpaRepository<Admin, Integer>  {
  public Admin findByAdminId(int adminId);
  public List<Admin>findByAdminName(String adminName);
}
