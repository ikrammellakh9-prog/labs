package com.microservice.product.service;

import com.microservice.product.dao.IDao;
import com.microservice.product.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl {

    @Autowired
    private IDao<Product> productDao;

    public void addProduct(Product p) {
        productDao.save(p);
    }

    public void updateProduct(Product p) {
        productDao.update(p);
    }

    public void deleteProduct(Long id) {
        productDao.delete(id);
    }

    @Transactional(readOnly = true)
    public Product getProduct(Long id) {
        return productDao.findById(id);
    }

    @Transactional(readOnly = true)
    public List<Product> getAllProducts() {
        return productDao.findAll();
    }
}
