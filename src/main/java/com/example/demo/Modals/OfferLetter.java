package com.example.demo.Modals;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OfferLetter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long offerId;

    private LocalDate offerDate;
    private LocalDate joiningDate;
    private double salary;

    @OneToOne
    @JoinColumn(name = "app_id")
    private Application application;
}