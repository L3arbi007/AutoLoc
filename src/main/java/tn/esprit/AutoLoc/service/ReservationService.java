package tn.esprit.AutoLoc.service;

import org.springframework.stereotype.Service;
import tn.esprit.AutoLoc.domain.Reservation;
import tn.esprit.AutoLoc.repository.ReservationRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    private final ReservationRepository Repository;

    public ReservationService(ReservationRepository Repository) {
        this.Repository = Repository;
    }

    public List<Reservation> getAll() {
        return Repository.findAll();
    }

    public Optional<Reservation> getById(Long id) {
        return Repository.findById(id);
    }

    public Reservation save(Reservation entity) {
        return Repository.save(entity);
    }

    public void delete(Long id) {
        Repository.deleteById(id);
    }
}
