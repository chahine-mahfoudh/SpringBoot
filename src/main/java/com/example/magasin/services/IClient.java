package com.example.magasin.services;

import com.example.magasin.entities.Client;

import java.util.List;

public interface IClient {

    List<Client> retrieveAllClient();

    Client addClient(Client c);

    Contrat updateClient(Client c);

    Client retrieveClient(Integer idClient);

    void removeClient(Integer idClient);

}
