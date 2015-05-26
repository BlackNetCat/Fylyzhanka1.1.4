package com.fylyzhanka.service;

import java.util.List;

import com.fylyzhanka.model.Product;

/**
 *
 * Product Service Interface
 *
 * @author melnikov
 * @since 08.04.2015
 * @version 1.0.0
 *
 */
public interface IProductService {

    /**
     * Add Product
     *
     * @param  Product producr
     */
    public void addProduct(Product product);

    /**
     * Update Product
     *
     * @param  Product product
     */
    public void updateProduct(Product product);

    /**
     * Delete Product
     *
     * @param  Product product
     */
    public void deleteProduct(Product product);

    /**
     * Get Product
     *
     * @param  int Product Id
     */
    public Product getProductById(int id);

    /**
     * Get Product List
     *
     * @return List - Product list
     */
    public List<Product> getProducts();
}
