package com.example.demo.Modals;


import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long messageId;

    private Long senderId;
    private Long receiverId;

    @Column(length = 1000)
    private String content;

    private LocalDateTime timestamp;
}