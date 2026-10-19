package tn.esprit.autoLoc.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoLoc.entities.Paiement;
import tn.esprit.autoLoc.services.PaiementService;

import java.util.List;

@RestController("/Paiemant")
@AllArgsConstructor
public class PaiementController {
    private PaiementService paiementService;

    @PostMapping("/ajouterPaiement")
    public Paiement ajouterPaiement(@RequestBody Paiement paiement){
        return paiementService.ajouterPaiment(paiement);
    }

    @DeleteMapping("/supprimerPaiement/{id}")
    public void supprimerPaiement(@PathVariable Long id){
        paiementService.supprimerPaiment(id);
    }

    @GetMapping("/recuppererPaiement")
    public List<Paiement> recuppererPaiement(){
        return paiementService.recupererPaiment();
    }

    @PutMapping("/modifierPaiement")
    public Paiement modifierPaiement(@RequestBody Paiement paiement){
        return paiementService.modifierPaiement(paiement);
    }
}
