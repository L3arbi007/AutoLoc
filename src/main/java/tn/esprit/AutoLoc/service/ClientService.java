package tn.esprit.AutoLoc.service;

import org.springframework.stereotype.Service;
import tn.esprit.AutoLoc.domain.Client;
import tn.esprit.AutoLoc.repository.ClientRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private final ClientRepository Repository;

    public ClientService(ClientRepository Repository) {
        this.Repository = Repository;
    }

    public List<Client> getAll() {
        return Repository.findAll();
    }

    public Optional<Client> getById(Long id) {
        return Repository.findById(id);
    }

    public Client save(Client entity) {
        return Repository.save(entity);
    }

    public void delete(Long id) {
        Repository.deleteById(id);
    }
}
