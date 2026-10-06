package tn.esprit.autoLoc.services;

import tn.esprit.autoLoc.entities.Equipement;

import java.util.List;

public interface IEquipementService {
    Equipement ajouterEquipement(Equipement equipement);
    void supprimerEquipement(Long id);
    List<Equipement> recupererEquipement();
    Equipement modifierEquipement(Equipement equipement);
}
