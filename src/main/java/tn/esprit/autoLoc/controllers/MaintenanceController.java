package tn.esprit.autoLoc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoLoc.entities.Maintenance;
import tn.esprit.autoLoc.services.MaintenanceService;

import java.util.List;

@RestController("/Maintenance")
@AllArgsConstructor
public class MaintenanceController {
    private MaintenanceService maintenanceService;

    @PostMapping("/ajouterMaintenance")
    public Maintenance ajouterMaintenance(@RequestBody Maintenance maintenance){
        return maintenanceService.ajouterMaintenance(maintenance);
    }

    @DeleteMapping("/supprimerMaintenance/{id}")
    public void supprimerMaintenance(@PathVariable Long id){
        maintenanceService.supprimerMaintenance(id);
    }

    @GetMapping("/recuppererMaintenance")
    public List<Maintenance> recuppererMaintenance(){
        return maintenanceService.recupererMaitnenance();
    }

    @PutMapping("/modifierMaintenance")
    public Maintenance modifierMaintenance(@RequestBody Maintenance maintenance){
        return maintenanceService.modifierMaintenance(maintenance);
    }
}
