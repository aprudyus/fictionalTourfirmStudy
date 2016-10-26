package com.tourfirm.dao.impl;

import com.tourfirm.dao.generic.CityDAO;
import com.tourfirm.dao.generic.HotelDAO;
import com.tourfirm.domain.City;
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

        return null;
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

        return null;
    }

    @Override
    public Hotel update(Hotel entity){

        return null;
    }

    @Override
    public void delete(Hotel entity){


    }
}