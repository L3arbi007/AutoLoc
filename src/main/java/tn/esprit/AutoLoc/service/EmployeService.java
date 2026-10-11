package tn.esprit.AutoLoc.service;

import org.springframework.stereotype.Service;
import tn.esprit.AutoLoc.domain.Employe;
import tn.esprit.AutoLoc.repository.EmployeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeService {

    private final EmployeRepository Repository;

    public EmployeService(EmployeRepository Repository) {
        this.Repository = Repository;
    }

    public List<Employe> getAll() {
        return Repository.findAll();
    }

    public Optional<Employe> getById(Long id) {
        return Repository.findById(id);
    }

    public Employe save(Employe entity) {
        return Repository.save(entity);
    }

    public void delete(Long id) {
        Repository.deleteById(id);
    }
}
