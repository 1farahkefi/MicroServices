package tn.enicarthage.Web_SpringBoot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.enicarthage.Web_SpringBoot.model.Etudiant;
import tn.enicarthage.Web_SpringBoot.model.Professeur;
import tn.enicarthage.Web_SpringBoot.repository.Etudiant_Repository;
import tn.enicarthage.Web_SpringBoot.repository.Professeur_Repository;
import tn.enicarthage.Web_SpringBoot.service.Etudiant_service;
import tn.enicarthage.Web_SpringBoot.service.Professeur_service;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Professeur")
public class Professeur_Controller {
    @Autowired
    private Professeur_service Professeur_service;



    @GetMapping("/all")
    public ResponseEntity<List<Professeur>> getAllProfesseur() {
        return new ResponseEntity<List<Professeur>>(Professeur_service.allProfesseur(), HttpStatus.OK);

    }
    @PostMapping("/create")
    public Professeur createEtudiant(@RequestBody Professeur Etudiant) {
        return Professeur_service.createProfesseur(Etudiant);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProfesseur(@PathVariable Long id) {
        Professeur_service.deleteProfesseur(id);
    }
}
