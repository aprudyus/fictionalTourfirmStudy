package com.tourfirm.dao.impl;

import com.tourfirm.dao.generic.ClientDAO;
import com.tourfirm.domain.Client;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public class ClientDAOImpl extends AbstractDAO<Client,Integer> implements ClientDAO {

    public ClientDAOImpl(){
        super(Client.class);
    }

    @Override
    public Client findById(Integer id){

        return super.findById(id);
    }

    @Override
    public List<Client> getAll(){
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(entityClass);
        criteria.addOrder(Order.desc("id"));
        return criteria.list();
    }


    @Override
    public Integer save(Client entity){

        return super.save(entity);
    }

    @Override
    public Client update(Client entity){

        return super.update(entity);
    }

    @Override
    public void delete(Client entity){
        super.delete(entity);
    }
}
