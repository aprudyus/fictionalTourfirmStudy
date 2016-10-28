package com.tourfirm.dao.generic;

import com.tourfirm.domain.Client;

import java.util.List;


public interface ClientDAO extends GenericDAO<Client, Integer>{

    public abstract Client findById(Integer id);

    public abstract List<Client> getAll();

    public abstract Integer save(Client client);

    public abstract Client update(Client client);

    public abstract void delete(Client client);
}