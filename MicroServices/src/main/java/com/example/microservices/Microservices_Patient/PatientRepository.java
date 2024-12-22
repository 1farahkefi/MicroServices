/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.microservices.Microservices_Patient;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author farah
 */
@Repository
public interface PatientRepository extends JpaRepository<PatientData, Long> {
    PatientData findByName(String name);
}
