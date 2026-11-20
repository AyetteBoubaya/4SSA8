package tn.esprit.autoLoc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoLoc.entities.Contrat;
import tn.esprit.autoLoc.entities.Reservation;
import tn.esprit.autoLoc.repositories.ContratRepository;
import tn.esprit.autoLoc.repositories.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements  IReservationService{
    private ReservationRepository reservationRepository;
    private ContratRepository contratRepository;

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

    @Override
    public void desaffecterContratDeReservation(Long idReservation) {

    }

    @Override
    public void affecterContratAReservation(Long id, Long idReservation) {
        Contrat contrat = contratRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contrat introuvable"));
        Reservation reservation = reservationRepository.findById(idReservation)
                .orElseThrow(() -> new RuntimeException("Reservation introuvable"));

        reservation.setContrat(contrat);
        reservationRepository.save(reservation);
    }

    @Override
    public void affecterClientAReservation(Long idClient, Long idReservation) {
        Reservation reservation = reservationRepository.findById(idReservation)
                .orElseThrow(() -> new RuntimeException("Reservation introuvable"));

        reservation.setContrat(null);
        reservationRepository.save(reservation);
    }
}
