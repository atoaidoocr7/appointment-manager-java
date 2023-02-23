package edu.temple.cis.appointmentmanagement.controllers;
import edu.temple.cis.appointmentmanagement.entities.Appointment;

import edu.temple.cis.appointmentmanagement.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/appointment")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;

    @PostMapping
    public Appointment createAppointment(@RequestBody Appointment appointment){
        return appointmentService.createAppointment(appointment);
    }

    @GetMapping("/{id}")
    public Appointment getAppointment(@PathVariable(value = "id") Long id){
        return appointmentService.getAppointment(id);
    }

    @PutMapping("/{id}")
    public Appointment updateAppointment(@PathVariable("id") Long id){
        return appointmentService.updateAppointment(id);
    }

    @DeleteMapping("/{id}")
    public Appointment deleteAppointment(@PathVariable("id") Long id){
        return appointmentService.deleteAppointment(id);
    }
    @GetMapping()
    public List<Appointment> fetchAllAppointments(){
        return appointmentService.fetchAllAppointments();
    }


}
