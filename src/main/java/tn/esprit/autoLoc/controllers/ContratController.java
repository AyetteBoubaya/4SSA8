package tn.esprit.autoLoc.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoLoc.entities.Agence;
import tn.esprit.autoLoc.entities.Contrat;
import tn.esprit.autoLoc.services.ContratService;

import java.util.List;

@RestController("/Contrat")
@AllArgsConstructor
public class ContratController {
    private ContratService contratService;

    @PostMapping("/ajouterContrat")
    public Contrat ajouterContrat(@RequestBody Contrat contrat){
        return contratService.ajouterContrat(contrat);
    }

    @DeleteMapping("/supprimerContrat/{id}")
    public void supprimerContrat(@PathVariable Long id){ contratService.supprimerContrat(id);
    }

    @GetMapping("/recuppererContrat")
    public List<Contrat> recuppererContrat(){
        return contratService.recupererContrat();
    }

    @PutMapping("/modifierContrat")
    public Contrat modifierContrat(@RequestBody Contrat contrat){
        return contratService.modifierContrat(contrat);
    }
}
