package edu.temple.cis.appointmentmanagement.services;

import edu.temple.cis.appointmentmanagement.entities.User;
import edu.temple.cis.appointmentmanagement.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public User getUser(Long id){
        return null;
    }

    public User createUser(User newUser){
        return userRepository.save(newUser);
    }

    public User updateUser(Long id){
        return null;
    }

    public User deleteUser(Long id){
        return null;
    }
}
