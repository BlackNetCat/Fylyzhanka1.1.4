package com.fylyzhanka.service;

import java.util.List;

import com.fylyzhanka.dao.IProductDAO;
import org.springframework.transaction.annotation.Transactional;

import com.fylyzhanka.model.Product;

/**
 *
 * Product Service
 *
 * @author melnikov
 * @since 08.04.2015
 * @version 1.0.0
 *
 */
@Transactional(readOnly = true)
public class ProductService implements IProductService {

    // ProductDAO is injected...
    IProductDAO productDAO;

    /**
     * Add Product
     *
     * @param  Product product
     */
    @Transactional(readOnly = false)
    @Override
    public void addProduct(Product product) {
        getProductDAO().addProduct(product);
    }

    /**
     * Delete Product
     *
     * @param  Product product
     */
    @Transactional(readOnly = false)
    @Override
    public void deleteProduct(Product product) {
        getProductDAO().deleteProduct(product);
    }

    /**
     * Update Product
     *
     * @param  Product product
     */
    @Transactional(readOnly = false)
    @Override
    public void updateProduct(Product product) {
        getProductDAO().updateProduct(product);
    }

    /**
     * Get Product
     *
     * @param  int Product Id
     */
    @Override
    public Product getProductById(int id) {
        return getProductDAO().getProductById(id);
    }

    /**
     * Get Product List
     *
     */
    @Override
    public List<Product> getProducts() {
        return getProductDAO().getProducts();
    }

    /**
     * Get Product DAO
     *
     * @return IProductDAO - Product DAO
     */
    public IProductDAO getProductDAO() {
        return productDAO;
    }

    /**
     * Set Product DAO
     *
     * @param IUserDAO - Product DAO
     */
    public void setProductDAO(IProductDAO productDAO) {
        this.productDAO = productDAO;
    }

}
