package com.example.magasin.services;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IClientImp implements IClient{
    private final ClientRepository clientRepository;

    public IClientImp(ContratRepository contratRepository) {
        this.ClientRepository = ClientRepository;
    }

    @Override
    public List<Client> retrieveAllClient() {
        return ClientRepository.findAll();
    }

    @Override
    public Client addClient(Client c) {
        return contratRepository.save(ce);
    }

    @Override
    public Client updateClient(Client c) {
        return contratRepository.save(ce);
    }

    @Override
    public Client retrieveClient(Integer idClient) {
        return ClientRepository.findById(idClient).orElse(null);
    }

    @Override
    public void removeClient(Integer idClient) {
        ClientRepository.deleteById(idClient);
    }
}
