package edu.temple.cis.appointmentmanagement.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
public class User {
    @Id
    private Long id;
    private String username, password;
    private List<Appointment> appointments;
}
