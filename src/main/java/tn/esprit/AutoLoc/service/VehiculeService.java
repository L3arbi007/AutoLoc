package tn.esprit.AutoLoc.service;

import org.springframework.stereotype.Service;
import tn.esprit.AutoLoc.domain.Vehicule;
import tn.esprit.AutoLoc.repository.VehiculeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculeService {

    private final VehiculeRepository Repository;

    public VehiculeService(VehiculeRepository Repository) {
        this.Repository = Repository;
    }

    public List<Vehicule> getAll() {
        return Repository.findAll();
    }

    public Optional<Vehicule> getById(Long id) {
        return Repository.findById(id);
    }

    public Vehicule save(Vehicule entity) {
        return Repository.save(entity);
    }

    public void delete(Long id) {
        Repository.deleteById(id);
    }
}
