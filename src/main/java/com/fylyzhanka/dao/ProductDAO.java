package com.fylyzhanka.dao;

import java.util.List;

import com.fylyzhanka.model.Product;

import org.hibernate.SessionFactory;

/**
 *
 * Product DAO
 *
 * @author melnikov
 * @since 08.04.2015
 * @version 1.0.0
 *
 */

public class ProductDAO implements IProductDAO {

    private SessionFactory sessionFactory;

    /**
     * Get Hibernate Session Factory
     *
     * @return SessionFactory - Hibernate Session Factory
     */
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    /**
     * Set Hibernate Session Factory
     *
     * @param SessionFactory - Hibernate Session Factory
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    /**
     * Add Product
     *
     * @param  Product product
     */
    @Override
    public void addProduct(Product product) {
        getSessionFactory().getCurrentSession().save(product);
    }

    /**
     * Delete Product
     *
     * @param  Product product
     */
    @Override
    public void deleteProduct(Product product) {
        getSessionFactory().getCurrentSession().delete(product);
    }

    /**
     * Update Product
     *
     * @param  Product product
     */
    @Override
    public void updateProduct(Product product) {
        getSessionFactory().getCurrentSession().update(product);
    }

    /**
     * Get Product
     *
     * @param  int Product Id
     * @return Product
     */
    @Override
    public Product getProductById(int id) {
        List list = getSessionFactory().getCurrentSession()
                .createQuery("from Product where id=?")
                .setParameter(0, id).list();
        return (Product)list.get(0);
    }

    /**
     * Get Product List
     *
     * @return List - Product list
     */
    @Override
    public List<Product> getProducts() {
        List list = getSessionFactory().getCurrentSession().createQuery("from Product").list();
        return list;
    }

}
