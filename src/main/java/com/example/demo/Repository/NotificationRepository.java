package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Modals.HR;
import com.example.demo.Modals.Notification;

public interface NotificationRepository extends JpaRepository<Notification,Long>{
	HR findByEmail(String email);


}
