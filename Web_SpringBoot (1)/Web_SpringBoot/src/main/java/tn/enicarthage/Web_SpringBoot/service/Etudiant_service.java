package tn.enicarthage.Web_SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.enicarthage.Web_SpringBoot.model.Etudiant;
import tn.enicarthage.Web_SpringBoot.model.Professeur;
import tn.enicarthage.Web_SpringBoot.repository.Etudiant_Repository;
import tn.enicarthage.Web_SpringBoot.repository.Professeur_Repository;

import java.util.List;
@Service
public class Etudiant_service {
    @Autowired
    private Etudiant_Repository Etudiant_Repository;
    public List<Etudiant> allEtudiant() {return (List<Etudiant>) Etudiant_Repository.findAll();
    };
    public Etudiant getEtudiantById(Long id) {
        return  Etudiant_Repository.findById(id)
                .orElse(null);
    };
    public Etudiant createEtudiant(Etudiant Etudiant) {
        return Etudiant_Repository.save(Etudiant);
    }

    public void deleteEtudiant(Long id) {
        Etudiant_Repository.deleteById(id);
    }
}
