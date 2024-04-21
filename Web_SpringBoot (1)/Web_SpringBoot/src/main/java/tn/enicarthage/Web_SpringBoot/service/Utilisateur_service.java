package tn.enicarthage.Web_SpringBoot.service;



import tn.enicarthage.Web_SpringBoot.model.Utilisateur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.enicarthage.Web_SpringBoot.repository.Utilisateur_Repository;

import java.util.List;

@Service
public class Utilisateur_service {
    @Autowired
    private Utilisateur_Repository utilisateur_Repository;
    public  List<Utilisateur> allUtilisateur() {return (List<Utilisateur>) utilisateur_Repository.findAll();
    };
    public Utilisateur createUtilisateur(Utilisateur uti) {
        return utilisateur_Repository.save(uti);
    }
    public Utilisateur getUtilisateurById(Long id) {
        return  utilisateur_Repository.findById(id)
                .orElse(null);
    };

    public void deleteUtilisateur(Long id) {
        utilisateur_Repository.deleteById(id);
    };





}









