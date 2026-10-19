package tn.esprit.autoLoc.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoLoc.entities.Agence;
import tn.esprit.autoLoc.entities.Client;
import tn.esprit.autoLoc.services.ClientService;

import java.util.List;

@RestController("/Client")
@AllArgsConstructor
public class ClientController {
    private ClientService clientService;

    @PostMapping("/ajouterClient")
    public Client ajouterClient(@RequestBody Client client){
        return clientService.ajouterClient(client);
    }

    @DeleteMapping("/supprimerClient/{id}")
    public void supprimerClient(@PathVariable Long id){
        clientService.supprimerClient(id);
    }

    @GetMapping("/recuppererClient")
    public List<Client> recuppererClient(){
        return clientService.recupererClient();
    }

    @PutMapping("/modifierClient")
    public Client modifierClient(@RequestBody Client client){
        return clientService.modifierClient(client);
    }
}
