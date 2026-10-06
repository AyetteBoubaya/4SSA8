package tn.esprit.autoLoc.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoLoc.entities.Paiement;

@Repository
public interface PaimentRepository extends JpaRepository<Paiement, Long> {
}
