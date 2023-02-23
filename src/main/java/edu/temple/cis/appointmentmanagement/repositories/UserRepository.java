package edu.temple.cis.appointmentmanagement.repositories;

import edu.temple.cis.appointmentmanagement.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {
}
