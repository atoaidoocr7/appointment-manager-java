package edu.temple.cis.appointmentmanagement.controllers;

import edu.temple.cis.appointmentmanagement.entities.User;
import edu.temple.cis.appointmentmanagement.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping
    public User createUser(@PathVariable("id") User user){
        return userService.createUser(user);
    }

    @GetMapping("/id")
    public User getUser(@PathVariable(value = "id") Long id){
        return userService.getUser(id);
    }

    @PutMapping("/id")
    public User updateUser(@PathVariable("id") Long id){
        return userService.updateUser(id);
    }

    @DeleteMapping("/id")
    public User deleteUser(@PathVariable("id") Long id){
        return userService.deleteUser(id);
    }

}
