package com.microservice.product.dao;

import com.microservice.product.entity.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDaoImpl implements IDao<Product> {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Product entity) {
        sessionFactory.getCurrentSession().save(entity);
    }

    @Override
    public void update(Product entity) {
        sessionFactory.getCurrentSession().update(entity);
    }

    @Override
    public void delete(Long id) {
        Product p = findById(id);
        if (p != null) {
            sessionFactory.getCurrentSession().delete(p);
        }
    }

    @Override
    public Product findById(Long id) {
        return sessionFactory.getCurrentSession().get(Product.class, id);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Product> findAll() {
        return sessionFactory.getCurrentSession().createQuery("from Product").list();
    }
}
