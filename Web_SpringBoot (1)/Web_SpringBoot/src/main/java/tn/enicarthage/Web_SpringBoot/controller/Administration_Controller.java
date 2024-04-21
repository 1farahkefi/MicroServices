package tn.enicarthage.Web_SpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.enicarthage.Web_SpringBoot.model.Administration;
import tn.enicarthage.Web_SpringBoot.service.Administration_service;
import tn.enicarthage.Web_SpringBoot.repository.Administration_Repository;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Administration")
public class Administration_Controller {
    @Autowired
    private Administration_service Administration_service;

    @GetMapping("/all")
    public ResponseEntity<List<Administration>> getAllAdministration() {
        return new ResponseEntity<List<Administration>>(Administration_service.allAdministration(), HttpStatus.OK);

    }

    @PostMapping("/create")
    public Administration createAverage1(@RequestBody Administration Administration) {
        return Administration_service.createAdministration(Administration);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteAdministration(@PathVariable Long id) {
        Administration_service.deleteAdministration(id);
    }


}
