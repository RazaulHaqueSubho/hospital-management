package com.hospital_management.jeeves.hospital_management.repositories;

import com.hospital_management.jeeves.hospital_management.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> { }
