package com.ironhack.lab4_4.service.interfaces;
import com.ironhack.lab4_4.model.Patient;

public interface IPatientService {

    // Create a route to add a new patient
    public Patient addNewPatient(Patient patient);

    // Create a patient's information (the user should be able to update any patient information through this route)
    public void updateAnyPatientInformation(Integer patientId, Patient patient);
}
