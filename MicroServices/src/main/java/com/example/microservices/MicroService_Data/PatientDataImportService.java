package com.example.microservices.MicroService_Data;

import com.example.microservices.Microservices_Patient.PatientData;
import com.example.microservices.Microservices_Patient.PatientData;
import com.example.microservices.Microservices_Patient.PatientData;
import com.example.microservices.Microservices_Patient.PatientRepository;
import com.example.microservices.Microservices_Patient.PatientRepository;
import com.example.microservices.Microservices_Patient.PatientRepository;
import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import com.opencsv.CSVReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class PatientDataImportService {

    @Autowired
    private PatientRepository patientDataRepository;

    @PostConstruct
    public void init() {
        try {
            importPatientData();
            System.out.println("Importation des données PatientData terminée avec succès !");
        } catch (Exception e) {
            System.err.println("Erreur lors de l'importation : " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Méthode pour importer les données des patients depuis un fichier CSV
     */
    @Transactional
    public void importPatientData() {
        List<PatientData> patientDataList = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try (CSVReader reader = new CSVReader(new InputStreamReader(
                new ClassPathResource("healthcare_dataset.csv").getInputStream()))) {

            String[] values;
            reader.readNext(); // Ignorer la ligne d'entête (header)

            while ((values = reader.readNext()) != null) {
                try {
                    // Validation et création du patientData
                    PatientData patientData = createPatientData(values);
                    patientData = patientDataRepository.save(patientData); // Sauvegarder le PatientData
                    patientDataList.add(patientData);

                    System.out.println("PatientData inséré avec succès : " + patientData.getName());

                } catch (Exception e) {
                    System.err.println("Erreur lors du traitement de la ligne : " + String.join(",", values));
                    e.printStackTrace();
                }
            }

            System.out.println("Importation des données PatientData terminée avec succès !");

        } catch (Exception e) {
            System.err.println("Erreur lors de l'importation des données : " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Méthode pour créer un PatientData à partir des données CSV
     */
    private PatientData createPatientData(String[] values) {
        PatientData patientData = new PatientData();
        patientData.setName(values[0].trim()); // Name
        patientData.setAge(parseInt(values[1], "Age"));
        patientData.setGender(values[2].trim()); // Gender
        patientData.setBloodType(values[3].trim()); // Blood Type
        patientData.setMedicalCondition(values[4].trim()); // Medical Condition
        patientData.setDateOfAdmission(parseDate(values[5], "Date of Admission")); // Date of Admission
        patientData.setDoctor(values[6].trim()); // Doctor
        patientData.setHospital(values[7].trim()); // Hospital
        patientData.setInsuranceProvider(values[8].trim()); // Insurance Provider
        patientData.setBillingAmount(parseDouble(values[9], "Billing Amount")); // Billing Amount
        patientData.setRoomNumber(parseInt(values[10], "Room Number")); // Room Number
        patientData.setAdmissionType(values[11].trim()); // Admission Type
        patientData.setDischargeDate(parseDate(values[12], "Discharge Date")); // Discharge Date
        patientData.setMedication(values[13].trim()); // Medication
        patientData.setTestResults(values[14].trim()); // Test Results
        return patientData;
    }

    /**
     * Méthode utilitaire pour parser un entier avec gestion des erreurs
     */
    private int parseInt(String value, String fieldName) {
        try {
            return Integer.parseInt(value.trim());
        } catch (NumberFormatException e) {
            System.err.println("Erreur de conversion pour le champ '" + fieldName + "': " + value);
            return 0; // Retourne une valeur par défaut en cas d'erreur
        }
    }

    /**
     * Méthode utilitaire pour parser un double avec gestion des erreurs
     */
    private double parseDouble(String value, String fieldName) {
        try {
            return Double.parseDouble(value.trim());
        } catch (NumberFormatException e) {
            System.err.println("Erreur de conversion pour le champ '" + fieldName + "': " + value);
            return 0.0; // Retourne une valeur par défaut en cas d'erreur
        }
    }

    /**
     * Méthode utilitaire pour parser une date avec gestion des erreurs
     */
    private java.util.Date parseDate(String value, String fieldName) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return dateFormat.parse(value.trim());
        } catch (ParseException e) {
            System.err.println("Erreur de conversion pour le champ '" + fieldName + "': " + value);
            return null; // Retourne null en cas d'erreur
        }
    }
}
