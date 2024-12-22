/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.microservices.Microservices_Patient;
import com.example.microservices.Microservices_Patient.PatientRepository;
import com.example.microservices.Microservices_Patient.PatientData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
/**
 *
 * @author farah
 */
@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public PatientData getPatientByName(String name) {
        return patientRepository.findByName(name);
    }

    public PatientData addPatient(PatientData patient) {
        return patientRepository.save(patient);
    }

    public PatientData updatePatient(String name, PatientData patient) {
        PatientData existingPatient = patientRepository.findByName(name);
        if (existingPatient != null) {
            existingPatient.setRoomNumber(patient.getRoomNumber());
            existingPatient.setMedicalCondition(patient.getMedicalCondition());
            return patientRepository.save(existingPatient);
        }
        throw new RuntimeException("Patient not found");
    }

    public void deletePatient(String name) {
        PatientData patient = patientRepository.findByName(name);
        if (patient != null) {
            patientRepository.delete(patient);
        } else {
            throw new RuntimeException("Patient not found");
        }
    }
       public List<PatientData> getAllPatients(){
        return patientRepository.findAll();
    }
}
