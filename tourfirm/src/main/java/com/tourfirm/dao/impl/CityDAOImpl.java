package com.tourfirm.dao.impl;

import com.tourfirm.dao.generic.CityDAO;
import com.tourfirm.domain.City;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public class CityDAOImpl extends AbstractDAO<City,Integer> implements CityDAO {

    public CityDAOImpl(){
        super(City.class);
    }

    @Override
    public City findById(Integer id){

        return super.findById(id);
    }

    @Override
    public List<City> getAll(){
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(entityClass);
        criteria.addOrder(Order.desc("id"));
        return criteria.list();
    }

    @Override
    public List<City> getAllInCountry(String country){

        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(entityClass);
        criteria.addOrder(Order.desc("id"));
        criteria.add(Restrictions.eq("country", country));
        return criteria.list();
    }

    @Override
    public Integer save(City entity){

        return super.save(entity);
    }

    @Override
    public City update(City entity){

        return super.update(entity);
    }

    @Override
    public void delete(City entity){
        super.delete(entity);
    }
}
