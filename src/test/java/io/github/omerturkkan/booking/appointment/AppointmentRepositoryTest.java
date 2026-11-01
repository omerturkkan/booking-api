package io.github.omerturkkan.booking.appointment;

import org.springframework.transaction.annotation.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(properties = "spring.docker.compose.skip.in-tests=false")
@Transactional
class AppointmentRepositoryTest {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Test
    void savesAppointment() {
        Appointment appointment = new Appointment();
        appointment.setCustomerName("Jerry");
        appointment.setStartTime(LocalDateTime.of(2026, 11, 5, 10, 0));

        Appointment saved = appointmentRepository.saveAndFlush(appointment);

        assertThat(saved.getId()).isNotNull();
    }
}
