package com.hospital_management.jeeves.hospital_management.controllers;

import com.hospital_management.jeeves.hospital_management.models.Patient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    @GetMapping
    public List<Patient> getAllPatients(){
        System.out.println("Getting all patients");
        return null;
    }

    @PostMapping
    public Patient getPatient(@RequestBody Patient patient){
        System.out.println("Getting patient");
        return patient;
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id){
        System.out.println("Getting patient by Id");
        return null;
    }

    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable Long id, @RequestBody Patient patient){
        System.out.println("Updating patient");
        return null;
    }

    @DeleteMapping("/{id}")
    public Patient deletePatient(@PathVariable Long id){
        System.out.println("Deleting patient");
        return null;
    }

}
