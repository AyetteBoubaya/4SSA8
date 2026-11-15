package tn.esprit.autoLoc.services;

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
    public void affecterVehiculeAAgence(Long idVehicule, Long idAgence) {
        Agence agence = agenceRepository.findById(idAgence).orElseThrow(()-> new RuntimeException("Agence n'existe pas "));
        Vehicule vehicule = vehiculeRepository.findById(idVehicule).orElseThrow(()-> new RuntimeException("Vehicule n'exsite pas"));

        vehicule.setAgence(agence);
        vehiculeRepository.save(vehicule);
    }

    @Override
    public void desaffecterVehiculeDAgence(Long idVehicule) {
        Vehicule vehicule = vehiculeRepository.findById(idVehicule).orElseThrow(()-> new RuntimeException("Vehicule n'exsite pas"));

        
    }


}
