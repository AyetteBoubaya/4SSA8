package tn.esprit.autoLoc.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoLoc.entities.Employe;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long> {
}
