package tn.esprit.autoLoc.services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoLoc.entities.Contrat;
import tn.esprit.autoLoc.repositories.ClientRepository;
import tn.esprit.autoLoc.repositories.ContratRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ContratService implements IContratService{

    private ContratRepository contratRepository;

    @Override
    public Contrat ajouterContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public void supprimerContrat(Long id) {
        contratRepository.deleteById(id);
    }

    @Override
    public List<Contrat> recupererContrat() {
        List<Contrat> contrats=contratRepository.findAll();
        return contrats;
    }

    @Override
    public Contrat modifierContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }
}
