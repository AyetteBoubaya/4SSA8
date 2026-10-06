package tn.esprit.autoLoc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoLoc.entities.Agence;
import tn.esprit.autoLoc.repositories.AgenceRepository;

import java.util.List;


@Service
@AllArgsConstructor
public class AgenceService implements IAgenceService{
    private AgenceRepository agenceRepository;


    @Override
    public Agence ajouterAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public void supprimerAgence(Long id) {
        agenceRepository.deleteById(id);
    }

    @Override
    public List<Agence> recupererAgence() {
        List<Agence> agences = agenceRepository.findAll();
        return agences;
    }

    @Override
    public Agence modifierAgence(Agence agence) {
        agenceRepository.save(agence);
        return null;
    }
}
