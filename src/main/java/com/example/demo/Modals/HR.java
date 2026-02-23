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
	
}
