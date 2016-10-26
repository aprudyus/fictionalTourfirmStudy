package com.tourfirm.dao.impl;

import com.tourfirm.dao.generic.GenericDAO;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Repository
@Transactional
public abstract class AbstractDAO<T, ID extends Serializable> implements GenericDAO<T, ID> {

    @Autowired
    public SessionFactory sessionFactory;

    public Class<T> entityClass;

    protected AbstractDAO(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T findById(ID id) {
        return (T) sessionFactory.getCurrentSession().get(entityClass, id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<T> getAll() {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(entityClass);
        criteria.addOrder(Order.desc("id"));
        return criteria.list();
    }

    @SuppressWarnings("unchecked")
    @Override
    public ID save(T entity) {
        return (ID) sessionFactory.getCurrentSession().save(entity);
    }

    @SuppressWarnings("unchecked")
    @Override
    public T update(T entity) {
        return (T) sessionFactory.getCurrentSession().merge(entity);
    }

    @Override
    public void delete(T entity) {
        sessionFactory.getCurrentSession().delete(entity);
    }
}

