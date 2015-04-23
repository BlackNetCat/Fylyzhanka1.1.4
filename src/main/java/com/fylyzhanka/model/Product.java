package com.fylyzhanka.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * Product Entity
 *
 * @author melnikov
 * @since 08.04.2015
 * @version 1.0.0
 *
 */
@Entity
@Table(name="PRODUCT")
public class Product {

    private int id;
    private String name;
    private float cost;

    /**
     * Get Product Id
     *
     * @return int - Product Id
     */
    @Id
    @Column(name="ID", unique = true, nullable = false)
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
     * @return String - Product Name
     */
    @Column(name="NAME", unique = true, nullable = false)
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
    @Column(name="COST", unique = true, nullable = false)
    public float getCost() {
        return cost;
    }

    /**
     * Set Product Cost
     *
     * @param  - Product cost
     */
    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        StringBuffer strBuff = new StringBuffer();
        strBuff.append("id : ").append(getId());
        strBuff.append(", name : ").append(getName());
        strBuff.append(", cost : ").append(getCost());
        return strBuff.toString();
    }
}
