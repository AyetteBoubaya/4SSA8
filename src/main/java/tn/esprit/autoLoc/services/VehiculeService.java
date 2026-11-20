package tn.esprit.autoLoc.services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoLoc.entities.Equipement;
import tn.esprit.autoLoc.entities.Vehicule;
import tn.esprit.autoLoc.repositories.EquipementRepository;
import tn.esprit.autoLoc.repositories.VehiculeRepository;

import java.util.HashSet;
import java.util.List;

@Service
@AllArgsConstructor
public class VehiculeService implements IVehiculeService {
    private VehiculeRepository vehiculeRepository;
    private EquipementRepository equipementRepository;


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

    @Override
    public void affectationEquipementAVehicule(Long idEquipement, Long idVehicule) {
        Equipement equipement = equipementRepository.findById(idEquipement)
                .orElseThrow(() -> new RuntimeException("Equipement introuvable"));
        Vehicule vehicule = vehiculeRepository.findById(idVehicule)
                .orElseThrow(() -> new RuntimeException("Vehicule introuvable"));

        if (vehicule.getEquipements() == null) {
            vehicule.setEquipements(new HashSet<>());
        }
        vehicule.getEquipements().add(equipement);
        vehiculeRepository.save(vehicule);
    }

    @Override
    public void desaffectaterEquipementDeVehicule(Long idEquipement, Long idVehicule) {
        Equipement equipement = equipementRepository.findById(idEquipement)
                .orElseThrow(() -> new RuntimeException("Equipement introuvable"));
        Vehicule vehicule = vehiculeRepository.findById(idVehicule)
                .orElseThrow(() -> new RuntimeException("Vehicule introuvable"));

        if (vehicule.getEquipements() != null) {
            vehicule.getEquipements().remove(equipement);
        }
        vehiculeRepository.save(vehicule);
    }





}
