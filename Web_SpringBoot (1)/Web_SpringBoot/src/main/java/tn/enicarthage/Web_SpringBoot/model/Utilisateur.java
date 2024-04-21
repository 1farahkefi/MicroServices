package tn.enicarthage.Web_SpringBoot.model;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

import lombok.*;

import jakarta.persistence.*;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="Utilisateur")
    public class Utilisateur implements Serializable {
        /**
         *
         */
        @Serial
        private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        @Column(name="prenom")
        private String prenom;
        @Column(name="nom")
        private String nom;
        @Column(name="dateOfBirth")
        private Date dateOfBirth;
        @Setter
        @Column(name="email")
        private String email;
        @Column(name="password")
        private String password;
        @Column(name="Role")
        @Enumerated(EnumType.STRING)
        private Role role;




    public Utilisateur(String email,String password) {
        this.email = email;
        this.password=password;
    }
}


