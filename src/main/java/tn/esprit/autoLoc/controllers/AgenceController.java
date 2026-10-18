package tn.esprit.autoLoc.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoLoc.entities.Agence;
import tn.esprit.autoLoc.services.AgenceService;

import java.util.List;

@RestController("/Agence")
@AllArgsConstructor
public class AgenceController {
    private AgenceService agenceService;

    @PostMapping("/ajouterAgence")
    public Agence ajouterAgence(@RequestBody Agence agence){
        return agenceService.ajouterAgence(agence);
    }

    @DeleteMapping("/supprimerAgence/{id}")
    public void supprimerAgence(@PathVariable Long id){
        agenceService.supprimerAgence(id);
    }

    @GetMapping("/recuppererAgence")
    public List<Agence> recuppererAgence(){
        return agenceService.recupererAgence();
    }

    @PutMapping("/modifierAgence")
    public Agence modifierAgence(@RequestBody Agence agence){
        return agenceService.modifierAgence(agence);
    }



}
