package tn.esprit.autoLoc.entities;


import jakarta.persistence.*;
import lombok.*;
import tn.esprit.autoLoc.entities.enums.CategorieVehicule;
import tn.esprit.autoLoc.entities.enums.StatutVehicule;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Vehicule {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicule;
    private String immatriculation;
    private String marque;
    private String modele;
    private CategorieVehicule categorie;
    private BigDecimal tarifJournalier;
    private StatutVehicule statut;

    @ManyToOne
    private Agence agence;

    @ManyToMany(cascade=CascadeType.ALL)
    private Set<Equipement> equipements;

    @OneToMany(mappedBy = "vehicule", cascade = CascadeType.ALL)
    private Set<Reservation> reservations;

}
