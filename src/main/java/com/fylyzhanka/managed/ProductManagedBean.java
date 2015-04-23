package com.fylyzhanka.managed;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.fylyzhanka.service.IProductService;
import org.springframework.dao.DataAccessException;

import com.fylyzhanka.model.Product;

/**
 *
 * Product Managed Bean
 *
 * @author melnikov
 * @since 08.04.2015
 * @version 1.0.0
 *
 */
@ManagedBean(name="productMB")
@RequestScoped
public class ProductManagedBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final String INPUTPRODUCT = "inputproduct";
    private static final String DELETEPRODUCT = "delproduct";
    private static final String SUCCESS = "success";
    private static final String ERROR   = "error";

    //Spring User Service is injected...
    @ManagedProperty(value="#{ProductService}")
    IProductService productService;

    List<Product> productList;

    private int id;
    private String name;
    private float cost;

    /**
     * Add Product
     *
     * @return String - Response Message
     */
    public String addProduct() {
        try {
            Product product = new Product();
            product.setId(getId());
            product.setName(getName());
            product.setCost(getCost());
            getProductService().addProduct(product);
            return SUCCESS;
        } catch (DataAccessException e) {
            e.printStackTrace();
        }

        return ERROR;
    }

    /**
     * Delete Product
     *
     * @return String - Response Message
     */

    public String deleteProduct() {
        try {
            Product product = new Product();
            product.setId(getId());
            getProductService().deleteProduct(product);
            return DELETEPRODUCT;
        } catch (DataAccessException e) {
            e.printStackTrace();
        }

        return ERROR;
    }

    public String viewProduct() {
        return SUCCESS;
    }

    public String inputProduct() {
        return INPUTPRODUCT;
    }

    /**
     * Reset Fields
     *
     */
    public void reset() {
        this.setId(0);
        this.setName("");
        this.setCost(0);
    }

    /**
     * Get Product List
     *
     * @return List - Product List
     */
    public List<Product> getProductList() {
        productList = new ArrayList<Product>();
        productList.addAll(getProductService().getProducts());
        return productList;
    }

    /**
     * Get Product Service
     *
     * @return IProductService - Product Service
     */
    public IProductService getProductService() {
        return productService;
    }

    /**
     * Set Product Service
     *
     * @param IUserService - Product Service
     */
    public void setProductService(IProductService productService) {
        this.productService = productService;
    }

    /**
     * Set Product List
     *
     * @param List - User List
     */
    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    /**
     * Get Product Id
     *
     * @return int - Product Id
     */
    public int getId() {
        return id;
    }

    /**
     * Set Product Id
     *
     * @param int - Product Id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get Product Name
     *
     * @return String - User Name
     */
    public String getName() {
        return name;
    }

    /**
     * Set Product Name
     *
     * @param String - Product Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get Product Cost
     *
     * @return float - Product Cost
     */
    public float getCost() {
        return cost;
    }

    /**
     * Set Product Cost
     *
     * @param float - Product Cost
     */
    public void setCost(float cost) {
        this.cost = cost;
    }

}