package tn.esprit.autoLoc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoLoc.entities.Reservation;
import tn.esprit.autoLoc.repositories.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements  IReservationService{
    private ReservationRepository reservationRepository;


    @Override
    public Reservation ajouterReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void supprimerReservation(Long id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public List<Reservation> recupererReservation() {
        List<Reservation> reservations=reservationRepository.findAll();
        return reservations;
    }

    @Override
    public Reservation modifierReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}
