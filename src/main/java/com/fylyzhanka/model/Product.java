package com.fylyzhanka.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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
@Table(name="product")
public class Product {

    private int id;
    private String name;
    private float cost;
    private Set<Ingredient> ingredients = new HashSet<Ingredient>();

  //  private int ingredientId;

    /**
     * Get Product Id
     *
     * @return int - Product Id
     */
    @Id
    @GeneratedValue
    @Column(name="product_id", unique = true, nullable = false)
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
    @Column(name="name", unique = true, nullable = false)
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
    @Column(name="cost", unique = true, nullable = false)
    public float getCost() {
        return cost;
    }


   /* @Column(name="ingredientid", unique = false, nullable = false)
    public int getIngredientId() {
        return ingredientId;
    }
    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }*/



   /* @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "product_ingredient",joinColumns = {@JoinColumn(name = "product_id")},
            inverseJoinColumns = {@JoinColumn(name = "ingredient_id")}
    )
    public Set<Ingredient> getIngs() {
        return this.ingredients;
    }*/





    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "product_ingredient", joinColumns = {
            @JoinColumn(name = "product_id", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "ingredient_id",
                    nullable = false, updatable = false) })
    public Set<Ingredient> getIngredients() {
        return this.ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }







  /*  private Set<Ingredient> ingredients2 = new HashSet<Ingredient>();

    public Set<Ingredient> getIngredients2() {
        return ingredients2;
    }

    public void setIngredients2(Set<Ingredient> ingredients) {
        this.ingredients2 = ingredients;
    }*/



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
      //  strBuff.append(", ingredientid : ").append(getIngredientId());
        return strBuff.toString();
    }
}
