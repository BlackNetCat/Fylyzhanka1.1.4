package com.fylyzhanka.dao;

import java.util.List;

import com.fylyzhanka.model.Product;

/**
 *
 * Product DAO Interface
 *
 * @author melnikov
 * @since 08.04.2015
 * @version 1.0.0
 *
 */
public interface IProductDAO {

    /**
     * Add Product
     *
     * @param  Product product
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
     * @param  Prodcut product
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
     */
    public List<Product> getProducts();
}
