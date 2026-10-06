package tn.esprit.autoLoc.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoLoc.entities.Agence;
import tn.esprit.autoLoc.entities.Vehicule;

@Repository
public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {
}
