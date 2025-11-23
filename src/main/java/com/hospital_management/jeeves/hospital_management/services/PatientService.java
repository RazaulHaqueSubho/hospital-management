package com.hospital_management.jeeves.hospital_management.services;

import com.hospital_management.jeeves.hospital_management.models.Patient;
import com.hospital_management.jeeves.hospital_management.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    public Page<Patient> getAllPatients(int page, int size){
        try{
            Pageable pageable = PageRequest.of(page, size);
            return patientRepository.findAll(pageable);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Patient getPatientById(Long id){
        try{
            Optional<Patient> patient = patientRepository.findById(id);

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Patient createPatient(Patient patient){
        try{
            patientRepository.save(patient);
            System.out.println("Create patient successfully");

            return patient;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Patient updatePatientById(Long id, Patient updatePatient){
        try{
/*            Optional<Patient> patient = patientRepository.findById(id);
            if(patient.isPresent()){
                Patient p = patient.get();
                p.setName(updatePatient.getName());
                p.setAge(updatePatient.getAge());
                p.setGender(updatePatient.getGender());
                patientRepository.save(p);
            }
            return updatePatient;*/
            Patient patient = patientRepository.findById(id).orElseThrow(()-> new RuntimeException("Patient not found"));
            patient.setName(updatePatient.getName());
            patient.setAge(updatePatient.getAge());
            patient.setGender(updatePatient.getGender());
            patientRepository.save(patient);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Patient deletePatientById(Long id){
        try{
            patientRepository.deleteById(id);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
