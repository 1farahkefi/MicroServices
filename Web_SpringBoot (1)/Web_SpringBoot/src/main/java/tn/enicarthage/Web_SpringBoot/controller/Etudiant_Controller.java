package tn.enicarthage.Web_SpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.enicarthage.Web_SpringBoot.model.Etudiant;

import tn.enicarthage.Web_SpringBoot.service.Etudiant_service;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Etudiant")
public class Etudiant_Controller {
    @Autowired
    private Etudiant_service Etudiant_service;



    @GetMapping("/all")
    public ResponseEntity<List<Etudiant>> getAllEtudiant() {
        return new ResponseEntity<>(Etudiant_service.allEtudiant(), HttpStatus.OK);

    }

    @PostMapping("/create")
    public Etudiant createEtudiant(@RequestBody Etudiant Etudiant) {
        return Etudiant_service.createEtudiant(Etudiant);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteEtudiant(@PathVariable Long id) {
        Etudiant_service.deleteEtudiant(id);
    }

}
