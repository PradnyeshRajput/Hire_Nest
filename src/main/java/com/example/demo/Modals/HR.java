package com.example.demo.Modals;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HR {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long hrId;

	    private String companyName;
	    private String email;
	    private String password;
	    private String phone;
	    private String status; // APPROVED / PENDING
	    private String companyLocation;
	    private String companyDescription;
		public Long getHrId() {
			return hrId;
		}
		public void setHrId(Long hrId) {
			this.hrId = hrId;
		}
		public String getCompanyName() {
			return companyName;
		}
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getCompanyLocation() {
			return companyLocation;
		}
		public void setCompanyLocation(String companyLocation) {
			this.companyLocation = companyLocation;
		}
		public String getCompanyDescription() {
			return companyDescription;
		}
		public void setCompanyDescription(String companyDescription) {
			this.companyDescription = companyDescription;
		}
		
	
}
