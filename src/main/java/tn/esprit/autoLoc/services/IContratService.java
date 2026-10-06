package tn.esprit.autoLoc.services;

import tn.esprit.autoLoc.entities.Contrat;

import java.util.List;

public interface IContratService {

    Contrat ajouterContrat(Contrat contrat);
    void supprimerContrat(Long id);
    List<Contrat> recupererContrat();
    Contrat modifierContrat(Contrat contrat);
}
