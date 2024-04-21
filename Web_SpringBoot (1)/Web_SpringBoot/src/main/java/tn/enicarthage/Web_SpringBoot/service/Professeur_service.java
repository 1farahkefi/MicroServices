package tn.enicarthage.Web_SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.enicarthage.Web_SpringBoot.model.Professeur;
import tn.enicarthage.Web_SpringBoot.repository.Professeur_Repository;

import java.util.List;

@Service
public class Professeur_service {
    @Autowired
    private Professeur_Repository Professeur_Repository;
    public List<Professeur> allProfesseur() {return (List<Professeur>) Professeur_Repository.findAll();
    };
    public Professeur getProfesseurById(Long id) {
        return  Professeur_Repository.findById(id)
                .orElse(null);
    };
    public Professeur createProfesseur(Professeur Professeur) {
        return Professeur_Repository.save(Professeur);
    }

    public void deleteProfesseur(Long id) {
        Professeur_Repository.deleteById(id);
    }
}
