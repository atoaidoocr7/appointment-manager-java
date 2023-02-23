package edu.temple.cis.appointmentmanagement.repositories;

import edu.temple.cis.appointmentmanagement.entities.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends MongoRepository<Appointment, Long> {
}
