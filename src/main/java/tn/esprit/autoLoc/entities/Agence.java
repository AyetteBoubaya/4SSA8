package tn.esprit.autoLoc.entities;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

import java.util.Set;

@Entity
@Table(name="Agence")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Agence {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;

    private String nom;
    private String ville;
    private String adresse;
    private String telephone;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "agence")
    private Set<Employe> employes;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "agence")
    private Set<Vehicule> vehicules;

}
