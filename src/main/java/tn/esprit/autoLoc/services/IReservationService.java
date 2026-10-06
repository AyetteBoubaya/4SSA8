package tn.esprit.autoLoc.services;

import tn.esprit.autoLoc.entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation ajouterReservation(Reservation reservation);
    void supprimerReservation(Long id);
    List<Reservation> recupererReservation();
    Reservation modifierReservation(Reservation reservation);
}
