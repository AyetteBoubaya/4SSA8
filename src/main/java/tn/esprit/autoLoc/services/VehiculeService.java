package tn.esprit.autoLoc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoLoc.entities.Vehicule;
import tn.esprit.autoLoc.repositories.VehiculeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class VehiculeService implements IVehiculeService {
    private VehiculeRepository vehiculeRepository;


    @Override
    public Vehicule ajouterVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public void supprimerVehicule(Long id) {
        vehiculeRepository.deleteById(id);
    }

    @Override
    public List<Vehicule> recupererVehicule() {
        List<Vehicule> vehicules=vehiculeRepository.findAll();
        return vehicules;
    }

    @Override
    public Vehicule modifierVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }
}
