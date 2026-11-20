package tn.esprit.autoLoc.services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoLoc.entities.Agence;
import tn.esprit.autoLoc.entities.Vehicule;
import tn.esprit.autoLoc.repositories.AgenceRepository;
import tn.esprit.autoLoc.repositories.VehiculeRepository;

import java.util.List;


@Service
@AllArgsConstructor
public class AgenceService implements IAgenceService{
    private AgenceRepository agenceRepository;
    private VehiculeRepository vehiculeRepository;

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
        return agenceRepository.save(agence);
    }

    @Override
    @Transactional
    public void affecterVehiculeAAgence(Long idVehicule, Long idAgence) {
        Agence agence = agenceRepository.findById(idAgence)
                .orElseThrow(() -> new RuntimeException("Agence introuvable"));
        Vehicule vehicule = vehiculeRepository.findById(idVehicule)
                .orElseThrow(() -> new RuntimeException("Vehicule introuvable"));

        vehicule.setAgence(agence);          // côté propriétaire
        vehiculeRepository.save(vehicule);
    }

    @Override
    @Transactional
    public void desaffecterVehiculeDAgence(Long idVehicule) {
        Vehicule vehicule = vehiculeRepository.findById(idVehicule)
                .orElseThrow(() -> new RuntimeException("Vehicule introuvable"));

        vehicule.setAgence(null);            // on casse le lien
        vehiculeRepository.save(vehicule);
    }


}
