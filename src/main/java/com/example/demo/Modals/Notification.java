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
}