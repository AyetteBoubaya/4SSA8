package tn.esprit.autoLoc.services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoLoc.entities.Paiement;
import tn.esprit.autoLoc.repositories.PaimentRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PaiementService implements IPaiemantService{
    private PaimentRepository paimentRepository;


    @Override
    public Paiement ajouterPaiment(Paiement paiement) {
        return paimentRepository.save(paiement);
    }

    @Override
    public void supprimerPaiment(Long id) {
        paimentRepository.deleteById(id);
    }

    @Override
    public List<Paiement> recupererPaiment() {
        List<Paiement> paiements=paimentRepository.findAll();
        return paiements;
    }

    @Override
    public Paiement modifierPaiement(Paiement paiement) {
        return paimentRepository.save(paiement);
    }
}
