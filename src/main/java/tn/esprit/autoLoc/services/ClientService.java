package tn.esprit.autoLoc.services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoLoc.entities.Client;
import tn.esprit.autoLoc.repositories.ClientRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientService implements IClientService{

    private ClientRepository clientRepository;

    @Override
    public Client ajouterClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void supprimerClient(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public List<Client> recupererClient() {
        List<Client> clients= clientRepository.findAll();
        return clients;
    }

    @Override
    public Client modifierClient(Client client) {
        return clientRepository.save(client);
    }
}
