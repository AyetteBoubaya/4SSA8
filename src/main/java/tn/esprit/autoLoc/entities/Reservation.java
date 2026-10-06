package tn.esprit.autoLoc.entities;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.autoLoc.entities.enums.StatutReservation;

import java.time.LocalDate;

@Entity
@Table(name="Reservation")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Reservation {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private StatutReservation statut;

    @ManyToOne
    private Vehicule vehicule;

    @ManyToOne
    private Client client;

    @OneToOne
    private Contrat contrat;
}
