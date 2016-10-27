package com.tourfirm.dao.impl;

import com.tourfirm.dao.generic.HotelDAO;
import com.tourfirm.domain.Hotel;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public class HotelDAOImpl extends AbstractDAO<Hotel,Integer> implements HotelDAO {

    public HotelDAOImpl(){
        super(Hotel.class);
    }

    @Override
    public Hotel findById(Integer id){
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(entityClass);
        criteria.add(Restrictions.idEq(id));
        return (Hotel)criteria.uniqueResult();
    }

    @Override
    public List<Hotel> getAll(){
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(entityClass);
        criteria.addOrder(Order.desc("id"));
        return criteria.list();
    }

    @Override
    public List<Hotel> getAllInCity(String city){

        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(entityClass);
        criteria.addOrder(Order.desc("id"));
        criteria.add(Restrictions.eq("city", city));
        return criteria.list();
    }

    @Override
    public Integer save(Hotel entity){

        return super.save(entity);
    }

    @Override
    public Hotel update(Hotel entity){

        return super.update(entity);
    }

    @Override
    public void delete(Hotel entity){
        super.delete(entity);
    }
}