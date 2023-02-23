package edu.temple.cis.appointmentmanagement.services;

import edu.temple.cis.appointmentmanagement.entities.Appointment;
import edu.temple.cis.appointmentmanagement.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;

    public Appointment createAppointment(Appointment newAppointment){
        return appointmentRepository.save(newAppointment);
    }

    public Appointment getAppointment(Long id){
        return appointmentRepository.findById(id).orElse(null);
    }

    public List<Appointment> fetchAllAppointments(){
        return appointmentRepository.findAll();
    }

    public Appointment deleteAppointment(Long id){
        Appointment appointment = appointmentRepository.findById(id).orElse(null);
        appointmentRepository.deleteById(id);
        return appointment;
    }

    public Appointment updateAppointment(Long id){
        Appointment appointment = getAppointment(id);

        appointmentRepository.save(appointment);
        return appointment;
    }

}
