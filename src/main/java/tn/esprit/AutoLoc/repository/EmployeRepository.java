package tn.esprit.AutoLoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.AutoLoc.domain.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
}
