package com.ironhack.lab4_4.repository;
import com.ironhack.lab4_4.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {


}
