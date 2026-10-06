package tn.esprit.autoLoc.services;

import tn.esprit.autoLoc.entities.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule ajouterVehicule(Vehicule vehicule);
    void supprimerVehicule(Long id);
    List<Vehicule> recupererVehicule();
    Vehicule modifierVehicule(Vehicule vehicule);
}
