package tn.esprit.autoLoc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoLoc.entities.Equipement;
import tn.esprit.autoLoc.repositories.EquipementRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipementService implements IEquipementService{

    private EquipementRepository equipementRepository;

    @Override
    public Equipement ajouterEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public void supprimerEquipement(Long id) {
        equipementRepository.deleteById(id);
    }

    @Override
    public List<Equipement> recupererEquipement() {
        List<Equipement> equipements=equipementRepository.findAll();
        return equipements;
    }

    @Override
    public Equipement modifierEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }
}
