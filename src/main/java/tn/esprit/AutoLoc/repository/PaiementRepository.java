package tn.esprit.AutoLoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.AutoLoc.domain.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}
