package tn.enicarthage.Web_SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.enicarthage.Web_SpringBoot.model.Administration;
import tn.enicarthage.Web_SpringBoot.model.Etudiant;
import tn.enicarthage.Web_SpringBoot.repository.Administration_Repository;

import java.util.List;
@Service
public class Administration_service {
    @Autowired
    private Administration_Repository Administration_Repository;
    public List<Administration> allAdministration() {return (List<Administration>) Administration_Repository.findAll();
    };
    public Administration getAdministrationById(Long id) {
        return  Administration_Repository.findById(id)
                .orElse(null);
    };
    public Administration createAdministration(Administration Administration) {
        return Administration_Repository.save(Administration);
    }

    public void deleteAdministration(Long id) {
        Administration_Repository.deleteById(id);
    }
}
