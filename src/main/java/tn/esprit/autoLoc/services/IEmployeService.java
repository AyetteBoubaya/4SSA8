package tn.esprit.autoLoc.services;

import tn.esprit.autoLoc.entities.Employe;

import java.util.List;

public interface IEmployeService {
    Employe ajouterEmploye(Employe employe);
    void supprimerEmploye(Long id);
    List<Employe> recupererEmploye();
    Employe modifierEmploye(Employe employe);
}
