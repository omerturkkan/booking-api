package io.github.omerturkkan.booking.appointment;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Appointment {

    @Id
    @GeneratedValue
    private Long id;

    private String customerName;

    private LocalDateTime startTime;
}
