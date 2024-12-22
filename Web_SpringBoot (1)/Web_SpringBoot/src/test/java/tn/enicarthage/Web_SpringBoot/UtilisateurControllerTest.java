package tn.enicarthage.Web_SpringBoot;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import tn.enicarthage.Web_SpringBoot.controller.Etudiant_Controller;
import tn.enicarthage.Web_SpringBoot.model.*;
import tn.enicarthage.Web_SpringBoot.repository.Etudiant_Repository;
import tn.enicarthage.Web_SpringBoot.service.Etudiant_service;

import java.util.Date;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@ExtendWith(MockitoExtension.class)
public class EtudiantControllerTest {

    @Mock
    private Etudiant_service etudiant_service;

    @InjectMocks
    private Etudiant_Controller etudiant_Controller;

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private Etudiant_Repository etudiant_Repository;

    @Test
    public void createEtudiant() throws Exception {
        // Création d'un étudiant de test
        Date dateOfBirth=new Date(2000, 1, 1);
        Etudiant etudiant = new Etudiant(1L, "John", "Doe", dateOfBirth, "malek@gmail.com", "password", Role.Etudiant, Niveau.Premiere_Annee, Classe.A);

        // Configuration du comportement attendu de votre service
        when(etudiant_service.createEtudiant(any(Etudiant.class))).thenReturn(etudiant);

        // Envoi d'une requête POST pour créer l'étudiant
        mockMvc.perform(post("/api/v1/Etudiant/create")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(etudiant))) // Convertit l'objet Java en JSON
                .andExpect(status().isCreated());

    }
}
