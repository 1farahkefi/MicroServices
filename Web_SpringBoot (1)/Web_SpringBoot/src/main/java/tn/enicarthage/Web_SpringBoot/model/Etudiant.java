package tn.enicarthage.Web_SpringBoot.model;
import jakarta.persistence.*;

import lombok.*;

import java.io.Serial;

@Getter
@EqualsAndHashCode(callSuper = true)
@Data

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Etudiant extends Utilisateur {
    /**
     *
     */
    @Serial
    private static final long serialVersionUID = 1L;

    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name="niveau")
    private Niveau niveau;
    @Column(name="classe")
    @Enumerated(EnumType.STRING)
    private Classe classe;

    public Etudiant(String email, String password,Niveau nv,Classe cl) {
        super(email, password);
        this.niveau=nv;
        this.classe=cl;
    }

    @Override
    public String toString() {
        return "Etudiant [niveau=" + niveau + ", classe=" + classe + ", getId()=" + getId() + ", getPrenom()="
                + getPrenom() + ", getNom()=" + getNom() + ", getDateOfBirth()=" + getDateOfBirth() + ", getEmail()="
                + getEmail() + ", getPassword()=" + getPassword() + ", getRole()=" + getRole() + ", toString()="
                + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
    }


}




