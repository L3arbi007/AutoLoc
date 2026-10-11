package tn.esprit.AutoLoc.service;

import org.springframework.stereotype.Service;
import tn.esprit.AutoLoc.domain.Contrat;
import tn.esprit.AutoLoc.repository.ContratRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ContratService {

    private final ContratRepository Repository;

    public ContratService(ContratRepository Repository) {
        this.Repository = Repository;
    }

    public List<Contrat> getAll() {
        return Repository.findAll();
    }

    public Optional<Contrat> getById(Long id) {
        return Repository.findById(id);
    }

    public Contrat save(Contrat entity) {
        return Repository.save(entity);
    }

    public void delete(Long id) {
        Repository.deleteById(id);
    }
}
