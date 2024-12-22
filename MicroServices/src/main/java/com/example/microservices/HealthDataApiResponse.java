/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.microservices;

/**
 *
 * @author farah
 */
import com.example.microservices.Microservices_Patient.PatientData;
import java.util.List;

public class HealthDataApiResponse {
    private List<PatientData> data;

    // Getters and setters
    public List<PatientData> getData() {
        return data;
    }

    public void setData(List<PatientData> data) {
        this.data = data;
    }
   
}