package tn.esprit.AutoLoc.service;

import org.springframework.stereotype.Service;
import tn.esprit.AutoLoc.domain.Agence;
import tn.esprit.AutoLoc.repository.AgenceRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AgenceService {

    private final AgenceRepository Repository;

    public AgenceService(AgenceRepository Repository) {
        this.Repository = Repository;
    }

    public List<Agence> getAll() {
        return Repository.findAll();
    }

    public Optional<Agence> getById(Long id) {
        return Repository.findById(id);
    }

    public Agence save(Agence entity) {
        return Repository.save(entity);
    }

    public void delete(Long id) {
        Repository.deleteById(id);
    }
}
