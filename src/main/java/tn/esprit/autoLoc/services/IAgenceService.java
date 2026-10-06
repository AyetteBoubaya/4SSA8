package tn.esprit.autoLoc.services;

import tn.esprit.autoLoc.entities.Agence;

import java.util.List;

public interface IAgenceService {

    Agence ajouterAgence(Agence agence);
    void supprimerAgence(Long id);
    List<Agence> recupererAgence();
    Agence modifierAgence(Agence agence);

}
