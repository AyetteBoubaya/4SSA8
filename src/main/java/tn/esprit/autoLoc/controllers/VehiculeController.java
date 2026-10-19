package tn.esprit.autoLoc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoLoc.entities.Vehicule;
import tn.esprit.autoLoc.services.VehiculeService;

import java.util.List;

@RestController("/Vehicule")
@AllArgsConstructor
public class VehiculeController {
    private VehiculeService vehiculeService;

    @PostMapping("/ajouterVehicule")
    public Vehicule ajouterVehicule(@RequestBody Vehicule vehicule){
        return vehiculeService.ajouterVehicule(vehicule);
    }

    @DeleteMapping("/supprimerVehicule/{id}")
    public void supprimerVehicule(@PathVariable Long id){
        vehiculeService.supprimerVehicule(id);
    }

    @GetMapping("/recuppererVehicule")
    public List<Vehicule> recuppererVehicule(){
        return vehiculeService.recupererVehicule();
    }

    @PutMapping("/modifierVehicule")
    public Vehicule modifierVehicule(@RequestBody Vehicule vehicule){
        return vehiculeService.modifierVehicule(vehicule);
    }
}
