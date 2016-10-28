package com.tourfirm.service;


import com.tourfirm.dao.generic.ClientDAO;
import com.tourfirm.domain.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDAO clients;

    @Override
    public List<Client> listClients() {
        return clients.getAll();
    }

    @Override
    public Client findById(Integer id) {
        return clients.findById(id);
    }

    @Override
    public Integer save(Client client) {
        return clients.save(client);
    }

    @Override
    public Client update(Client client) {
        return clients.update(client);
    }

    @Override
    public void delete(Client client) {
        clients.delete(client);
    }

}
