package com.ironhack.lab4_4.controller.impl;
import com.ironhack.lab4_4.controller.interfaces.IPatientController;
import com.ironhack.lab4_4.model.Patient;
import com.ironhack.lab4_4.service.interfaces.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class PatientController implements IPatientController {

    @Autowired
    private IPatientService patientService;

    // 1. Create a route to add a new patient
    @PostMapping("/patient")
    @ResponseStatus(HttpStatus.CREATED)
    public Patient addNewPatient(@RequestBody @Valid Patient patient) {
        return patientService.addNewPatient(patient);
    }

    // 6. Create a patient's information (the user should be able to update any patient information through this route)
    @PutMapping("/patient-update/{patientId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateAnyPatientInformation(@PathVariable Integer patientId, @RequestBody @Valid Patient patient) {
        patientService.updateAnyPatientInformation(patientId, patient);
    }
}