package tn.esprit.autoLoc.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoLoc.entities.Contrat;

@Repository
public interface ContratRepository extends JpaRepository<Contrat, Long> {
}
