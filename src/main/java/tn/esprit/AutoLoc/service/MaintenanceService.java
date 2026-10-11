package tn.esprit.AutoLoc.service;

import org.springframework.stereotype.Service;
import tn.esprit.AutoLoc.domain.Maintenance;
import tn.esprit.AutoLoc.repository.MaintenanceRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MaintenanceService {

    private final MaintenanceRepository Repository;

    public MaintenanceService(MaintenanceRepository Repository) {
        this.Repository = Repository;
    }

    public List<Maintenance> getAll() {
        return Repository.findAll();
    }

    public Optional<Maintenance> getById(Long id) {
        return Repository.findById(id);
    }

    public Maintenance save(Maintenance entity) {
        return Repository.save(entity);
    }

    public void delete(Long id) {
        Repository.deleteById(id);
    }
}
