package tn.esprit.AutoLoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.AutoLoc.domain.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
