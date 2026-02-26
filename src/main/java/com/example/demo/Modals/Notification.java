package com.example.demo.Modals;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notifId;

    private Long userId;
    private String message;
    private String status; // READ / UNREAD
    private LocalDateTime createdAt;
    @ManyToOne
    private Student student;
	public Long getNotifId() {
		return notifId;
	}
	public void setNotifId(Long notifId) {
		this.notifId = notifId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public void setStudent(Student student2) {
		// TODO Auto-generated method stub
		
	}
}