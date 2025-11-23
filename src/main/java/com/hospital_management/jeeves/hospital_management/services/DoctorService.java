package com.hospital_management.jeeves.hospital_management.services;

import com.hospital_management.jeeves.hospital_management.controllers.PatientController;
import com.hospital_management.jeeves.hospital_management.models.Doctor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    public static final Logger logger = LoggerFactory.getLogger(DoctorService.class);

    public List<Doctor> getAllDoctor(){
        try {
            System.out.println("get all Doctor from Service");
        }
        catch(Exception e){
            System.out.println("error in service");
            logger.error("logger error in service", e.getMessage());
        }
        return null;
    }

    public Doctor getDoctorById(Long id){
        try {
            System.out.println("get all Doctor from Service"+ id);
        }
        catch(Exception e){
            System.out.println("error in service");
            logger.error("logger error in service", e.getMessage());
        }
        return null;
    }

    public Doctor createDoctor(Doctor doctor){
        try {
            System.out.println("create all Doctor from Service"+doctor);
        }
        catch(Exception e){
            System.out.println("error in service");
            logger.error("logger error in service", e.getMessage());
        }
        return null;
    }

    public Doctor updateDoctor(Long id){
        try {
            System.out.println("update all Doctor from Service"+id);
        }
        catch(Exception e){
            System.out.println("error in service");
            logger.error("logger error in service", e.getMessage());
        }
        return null;
    }

    public Doctor deleteDoctor(Long id){
        try {
            System.out.println("delete all Doctor from Service"+id);
        }
        catch(Exception e){
            System.out.println("error in service");
            logger.error("logger error in service", e.getMessage());
        }
        return null;
    }



}
