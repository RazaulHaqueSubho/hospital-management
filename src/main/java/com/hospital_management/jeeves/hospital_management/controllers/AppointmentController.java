package com.hospital_management.jeeves.hospital_management.controllers;

import com.hospital_management.jeeves.hospital_management.models.Appointment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {

    @GetMapping
    public List<Appointment> getAppointments(){
        System.out.println("Get all Appointments");
        return null;
    }

    @PostMapping
    public Appointment createAppointment(@RequestBody Appointment appointment){
        System.out.println(appointment.toString());
        return appointment;
    }

    @GetMapping("/{id}")
    public Appointment getAppointmentById(@PathVariable Long id){
        System.out.println("Get all Appointments by id");
        return null;
    }

    @PutMapping("/{id}")
    public Appointment updateAppointment(@PathVariable Long id){
        System.out.println("update all Appointments by id");
        return null;
    }

    @PutMapping("/{id}")
    public Appointment deleteAppointment(@PathVariable Long id){
        System.out.println("delete all Appointments by id");
        return null;
    }

}
