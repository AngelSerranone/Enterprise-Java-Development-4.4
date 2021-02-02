package com.ironhack.lab4_4.service.impl;
import com.ironhack.lab4_4.model.Employee;
import com.ironhack.lab4_4.model.Patient;
import com.ironhack.lab4_4.repository.PatientRepository;
import com.ironhack.lab4_4.service.interfaces.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class PatientService implements IPatientService {

    @Autowired
    private PatientRepository patientRepository;

    // Create a route to add a new patient
    public Patient addNewPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    // Create a patient's information (the user should be able to update any patient information through this route)
    public void updateAnyPatientInformation(Integer patientId, Patient patient){
        if (patientRepository.findById(patientId).isPresent()){
            patient.setPatientId(patientId);
            patientRepository.save(patient);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found");
        }
    }
}
