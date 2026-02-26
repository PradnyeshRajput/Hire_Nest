package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Modals.HR;

public interface HrRepositories extends JpaRepository<HR,Long>{
	HR findByEmail(String email);
}
