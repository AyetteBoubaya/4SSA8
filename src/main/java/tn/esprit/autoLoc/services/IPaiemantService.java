package tn.esprit.autoLoc.services;

import tn.esprit.autoLoc.entities.Paiement;

import java.util.List;

public interface IPaiemantService {
    Paiement ajouterPaiment(Paiement paiement);
    void supprimerPaiment(Long id);
    List<Paiement> recupererPaiment();
    Paiement modifierPaiement(Paiement paiement);
}
