/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.microservices.Microservices_Patient;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author farah
 */
@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/{name}")
    public ResponseEntity<PatientData> getPatientByName(@PathVariable String name) {
        PatientData patient = patientService.getPatientByName(name);
        return ResponseEntity.ok(patient);
    }

    @PostMapping
    public ResponseEntity<PatientData> addPatient(@RequestBody PatientData patient) {
        PatientData savedPatient = patientService.addPatient(patient);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedPatient);
    }

    @PutMapping("/{name}")
    public ResponseEntity<PatientData> updatePatient(@PathVariable String name, @RequestBody PatientData patient) {
        PatientData updatedPatient = patientService.updatePatient(name, patient);
        return ResponseEntity.ok(updatedPatient);
    }

    @DeleteMapping("/{name}")
    public ResponseEntity<Void> deletePatient(@PathVariable String name) {
        patientService.deletePatient(name);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/")
    public List<PatientData> getPatients(){
        return patientService.getAllPatients();
    }
}
