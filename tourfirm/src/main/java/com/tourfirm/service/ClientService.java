package com.tourfirm.service;

import com.tourfirm.domain.Client;

import java.util.List;


public interface ClientService {

    public abstract Integer save(Client client);

    public abstract Client findById(Integer id);

    public abstract Client update(Client client);

    public abstract void delete(Client client);

    public abstract List<Client> listClients();

}