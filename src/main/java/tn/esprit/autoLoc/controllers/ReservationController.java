package tn.esprit.autoLoc.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoLoc.entities.Reservation;
import tn.esprit.autoLoc.services.ReservationService;

import java.util.List;

@RestController("/Reservation")
@AllArgsConstructor
public class ReservationController {
    private ReservationService reservationService;

    @PostMapping("/ajouterReservation")
    public Reservation ajouterReservation(@RequestBody Reservation reservation){
        return reservationService.ajouterReservation(reservation);
    }

    @DeleteMapping("/supprimerReservation/{id}")
    public void supprimerReservation(@PathVariable Long id){
        reservationService.supprimerReservation(id);
    }

    @GetMapping("/recuppererReservation")
    public List<Reservation> recuppererReservation(){
        return reservationService.recupererReservation();
    }

    @PutMapping("/modifierReservation")
    public Reservation modifierReservation(@RequestBody Reservation reservation){
        return reservationService.modifierReservation(reservation);
    }

}
