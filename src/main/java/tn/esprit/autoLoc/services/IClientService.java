package tn.esprit.autoLoc.services;

import tn.esprit.autoLoc.entities.Client;

import java.util.List;

public interface IClientService {

    Client ajouterClient(Client client);
    void supprimerClient(Long id);
    List<Client> recupererClient();
    Client modifierClient(Client client);
}
