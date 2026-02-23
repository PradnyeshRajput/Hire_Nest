package com.example.demo.Modals;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobId;

    private String title;
    private String description;
    private double salary;
    private String location;
    private String category;
    private LocalDate expiryDate;

    @ManyToOne
    @JoinColumn(name = "hr_id")
    private HR hr;
}
