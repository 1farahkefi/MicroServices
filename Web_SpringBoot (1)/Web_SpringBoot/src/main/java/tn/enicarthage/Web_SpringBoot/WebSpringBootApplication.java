package tn.enicarthage.Web_SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tn.enicarthage.Web_SpringBoot.model.Role;
import tn.enicarthage.Web_SpringBoot.model.Utilisateur;
import tn.enicarthage.Web_SpringBoot.repository.Utilisateur_Repository;

import static tn.enicarthage.Web_SpringBoot.model.Role.Etudiant;

@SpringBootApplication
public class WebSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebSpringBootApplication.class, args);
	}


}
