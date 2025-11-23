package com.hospital_management.jeeves.hospital_management.controllers;

import com.hospital_management.jeeves.hospital_management.models.Doctor;
import com.hospital_management.jeeves.hospital_management.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @GetMapping
    public List<Doctor> getDoctor(){
        System.out.println("Get all doctors");
        doctorService.getAllDoctor();
        return null;
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor){
        System.out.println("Create a doctors");
        doctorService.createDoctor(doctor);
        return doctor;
    }

    @GetMapping("/id")
    public Doctor getDoctorById(@PathVariable Long id){
        System.out.println("Get doctor by id");
        doctorService.getDoctorById(id);
        return null;
    }

    @PutMapping("/id")
    public Doctor updateDoctorById(@PathVariable Long id){
        System.out.println("Update doctor by id");
        doctorService.updateDoctor(id);
        return null;
    }

    @DeleteMapping("/id")
    public Doctor deleteDoctorById(@PathVariable Long id){
        System.out.println("Delete doctor of id");
        doctorService.deleteDoctor(id);
        return null;
    }
}
