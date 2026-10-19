package tn.esprit.autoLoc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoLoc.entities.Equipement;
import tn.esprit.autoLoc.services.EquipementService;
import java.util.List;

@RestController("/Equipement")
@AllArgsConstructor
public class EquipementController {
    private EquipementService equipementService;

    @PostMapping("/ajouterEquipement")
    public Equipement ajouterEquipement(@RequestBody Equipement equipement){
        return equipementService.ajouterEquipement(equipement);
    }

    @DeleteMapping("/supprimerEquipement/{id}")
    public void supprimerEquipement(@PathVariable Long id){
        equipementService.supprimerEquipement(id);
    }

    @GetMapping("/recuppererEquipement")
    public List<Equipement> recuppererEquipement(){
        return equipementService.recupererEquipement();
    }

    @PutMapping("/modifierEquipement")
    public Equipement modifierEquipement(@RequestBody Equipement equipement){
        return equipementService.modifierEquipement(equipement);
    }
}
