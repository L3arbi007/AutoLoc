package tn.esprit.AutoLoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.AutoLoc.domain.Maintenance;

public interface MaintenanceRepository extends JpaRepository<Maintenance, Long> {
}
