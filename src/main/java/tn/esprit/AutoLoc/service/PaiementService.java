package tn.esprit.AutoLoc.service;

import org.springframework.stereotype.Service;
import tn.esprit.AutoLoc.domain.Paiement;
import tn.esprit.AutoLoc.repository.PaiementRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PaiementService {

    private final PaiementRepository Repository;

    public PaiementService(PaiementRepository Repository) {
        this.Repository = Repository;
    }

    public List<Paiement> getAll() {
        return Repository.findAll();
    }

    public Optional<Paiement> getById(Long id) {
        return Repository.findById(id);
    }

    public Paiement save(Paiement entity) {
        return Repository.save(entity);
    }

    public void delete(Long id) {
        Repository.deleteById(id);
    }
}
