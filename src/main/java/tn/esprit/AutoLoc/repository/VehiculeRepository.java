package tn.esprit.AutoLoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.AutoLoc.domain.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {
}
