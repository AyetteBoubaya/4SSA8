package tn.esprit.autoLoc.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoLoc.entities.Equipement;

@Repository
public interface EquipementRepository extends JpaRepository<Equipement, Long> {
}
