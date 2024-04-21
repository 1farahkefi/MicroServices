package tn.enicarthage.Web_SpringBoot.model;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serial;
import java.util.List;

@Setter
@Getter
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Professeur extends Utilisateur {
    /**
     *
     */
    @Serial
    private static final long serialVersionUID = 1L;
    @Enumerated(EnumType.STRING)
    @ElementCollection
    @CollectionTable(name="classes", joinColumns=@JoinColumn(name="professeur_id"))
    private List<Classe> classes;
    @Enumerated(EnumType.STRING)
    @Column(name="departement")
    private Departement departement;


    public Professeur() {

        super();

    }



    @Override
    public String toString() {
        return "Professeur [classes=" + classes + ", departement=" + departement + ", getId()=" + getId()
                + ", getPrenom()=" + getPrenom() + ", getNom()=" + getNom() + ", getDateOfBirth()=" + getDateOfBirth()
                + ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword() + ", getRole()=" + getRole()
                + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + "]";
    }

}
