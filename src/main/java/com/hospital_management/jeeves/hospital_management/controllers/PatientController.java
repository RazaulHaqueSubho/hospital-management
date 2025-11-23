package com.hospital_management.jeeves.hospital_management.controllers;

import com.hospital_management.jeeves.hospital_management.models.Patient;
import com.hospital_management.jeeves.hospital_management.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping
    public Page<Patient> getAllPatients(@RequestParam(defaultValue = "0")int page,
                                        @RequestParam(defaultValue = "3")int size){
        System.out.println("Getting all patients");
        return patientService.getAllPatients(page,size);
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient){
        patientService.createPatient(patient);
        return patient;
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id){
        System.out.println("Getting patient by Id");
        return patientService.getPatientById(id);
    }

    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable Long id, @RequestBody Patient patient){
        System.out.println("Updating patient");
        return patientService.updatePatientById(id, patient);
    }

    @DeleteMapping("/{id}")
    public Patient deletePatient(@PathVariable Long id){
        System.out.println("Deleting patient");
        return patientService.deletePatientById(id);
    }

}
