package edu.temple.cis.appointmentmanagement.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Data
public class Appointment {
    @Id
    private int id;
    private String[] users;
    private String description;
}