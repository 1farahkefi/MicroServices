package tn.enicarthage.Web_SpringBoot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.enicarthage.Web_SpringBoot.model.Professeur;

import java.util.Optional;

@Repository
public interface Professeur_Repository extends CrudRepository<Professeur, Long> {

}
