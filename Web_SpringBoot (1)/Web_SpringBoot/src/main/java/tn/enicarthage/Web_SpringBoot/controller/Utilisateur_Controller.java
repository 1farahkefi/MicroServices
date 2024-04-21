package tn.enicarthage.Web_SpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import tn.enicarthage.Web_SpringBoot.model.Professeur;
import tn.enicarthage.Web_SpringBoot.model.Utilisateur;
import tn.enicarthage.Web_SpringBoot.repository.Utilisateur_Repository;
import tn.enicarthage.Web_SpringBoot.service.Utilisateur_service;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Utilisateur")
public class Utilisateur_Controller {
    @Autowired
    private Utilisateur_service Utilisateur_service;



    @GetMapping("/all")
    public ResponseEntity<List<Utilisateur>> getAllUtilisateur() {
        return new ResponseEntity<List<Utilisateur>>(Utilisateur_service.allUtilisateur(), HttpStatus.OK);
    }
    @PostMapping("/create")
    public Utilisateur createUtilisateur(@RequestBody Utilisateur Etudiant) {
        return Utilisateur_service.createUtilisateur(Etudiant);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUtilisateur(@PathVariable Long id) {
        Utilisateur_service.deleteUtilisateur(id);
    }
}
