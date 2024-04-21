package tn.enicarthage.Web_SpringBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;


import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.util.Date;


@EqualsAndHashCode(callSuper = true)

@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Administration extends Utilisateur {
    /**
     *
     */
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    //private Poste poste;

    public Administration() {
        super();
    }

    public Administration(Long id) {
        this.id = id;
    }

    public Administration(Long id, String prenom, String nom, Date dateOfBirth, String email, String password, Role role, Long id1) {
        super(id, prenom, nom, dateOfBirth, email, password, role);
        this.id = id1;
    }

    public Administration(String email, String password, Long id) {
        super(email, password);
        this.id = id;
    }

    public Administration(String email, String password) {
        super(email, password);
    }


    public Long getId() {
        return id;
    }
}

