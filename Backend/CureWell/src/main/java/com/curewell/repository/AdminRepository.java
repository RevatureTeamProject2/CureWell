package com.curewell.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.curewell.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>  {

}
