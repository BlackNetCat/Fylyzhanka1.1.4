package com.fylyzhanka.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * Ingredient Entity
 *
 * @author melnikov
 * @since 08.04.2015
 * @version 1.0.0
 *
 */
@Entity
@Table(name="ingredient")
public class Ingredient {

    private int id;
    private String name;
    private Set<Product> products = new HashSet<Product>();

    @Id
    @GeneratedValue
    @Column(name="ingredient_id", unique = true, nullable = false)
    public int getIngredientId(){
        return id;
    }

    public void setIngredientId(int id) {
        this.id = id;
    }

    @Column(name="name", unique = true, nullable = false)
    public String getIngredientName() {
        return name;
    }

    public void setIngredientName(String name){
        this.name = name;
    }

   /* @ManyToMany(mappedBy = "ingredients")*/


    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "ingredients")
    public Set<Product> getProducts() {
        return this.products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }



    @Override
    public String toString() {
        StringBuffer strBuff = new StringBuffer();
        strBuff.append("id : ").append(getIngredientId());
        strBuff.append(", name : ").append(getIngredientName());
        return strBuff.toString();
    }
}
