package tn.esprit.autoLoc.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoLoc.entities.Agence;

@Repository
public interface AgenceRepository  extends JpaRepository<Agence, Long> {
}
