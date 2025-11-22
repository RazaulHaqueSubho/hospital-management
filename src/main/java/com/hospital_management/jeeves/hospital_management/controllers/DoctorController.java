package com.hospital_management.jeeves.hospital_management.controllers;

import com.hospital_management.jeeves.hospital_management.models.Doctor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorController {

    @GetMapping
    public List<Doctor> getDoctor(){
        System.out.println("Get all doctors");
        return null;
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor){
        System.out.println("Create a doctors");
        return doctor;
    }

    @GetMapping("/id")
    public Doctor getDoctorById(@PathVariable Long id){
        System.out.println("Get doctor by id");
        return null;
    }

    @PutMapping("/id")
    public Doctor updateDoctorById(@PathVariable Long id){
        System.out.println("Update doctor by id");
        return null;
    }

    @DeleteMapping("/id")
    public Doctor deleteDoctorById(@PathVariable Long id){
        System.out.println("Delete doctor of id");
        return null;
    }
}
