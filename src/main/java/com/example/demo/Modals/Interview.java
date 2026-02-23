package com.example.demo.Modals;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Interview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long interviewId;

    private LocalDate date;
    private LocalTime time;
    private String mode;   // ONLINE / OFFLINE
    private String status; // SCHEDULED / COMPLETED

    @OneToOne
    @JoinColumn(name = "app_id")
    private Application application;
    
}