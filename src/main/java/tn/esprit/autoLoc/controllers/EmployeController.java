package tn.esprit.autoLoc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoLoc.entities.Employe;
import tn.esprit.autoLoc.services.EmployeService;

import java.util.List;

@RestController("/Employe")
@AllArgsConstructor
public class EmployeController {
    private EmployeService employeService;

    @PostMapping("/ajouterEmploye")
    public Employe ajouterEmploye(@RequestBody Employe employe){
        return employeService.ajouterEmploye(employe);
    }

    @DeleteMapping("/supprimerEmploye/{id}")
    public void supprimerEmploye(@PathVariable Long id){
        employeService.supprimerEmploye(id);
    }

    @GetMapping("/recuppererEmploye")
    public List<Employe> recuppererEmploye(){
        return employeService.recupererEmploye();
    }

    @PutMapping("/modifierEmploye")
    public Employe modifierEmploye(@RequestBody Employe employe){
        return employeService.modifierEmploye(employe);
    }
}
