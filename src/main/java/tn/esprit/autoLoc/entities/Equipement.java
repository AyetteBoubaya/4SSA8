package tn.esprit.autoLoc.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name="Equipement")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Equipement {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipement;
    private String libelle;

    @ManyToMany(mappedBy="equipements" , cascade=CascadeType.ALL)
    private Set<Vehicule> vehicules;
}
