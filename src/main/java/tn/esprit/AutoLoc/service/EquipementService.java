package tn.esprit.AutoLoc.service;

import org.springframework.stereotype.Service;
import tn.esprit.AutoLoc.domain.Equipement;
import tn.esprit.AutoLoc.repository.EquipementRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EquipementService {

    private final EquipementRepository Repository;

    public EquipementService(EquipementRepository Repository) {
        this.Repository = Repository;
    }

    public List<Equipement> getAll() {
        return Repository.findAll();
    }

    public Optional<Equipement> getById(Long id) {
        return Repository.findById(id);
    }

    public Equipement save(Equipement entity) {
        return Repository.save(entity);
    }

    public void delete(Long id) {
        Repository.deleteById(id);
    }
}
