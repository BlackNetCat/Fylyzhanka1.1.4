package com.fylyzhanka.dao;

import java.util.List;

import com.fylyzhanka.model.Ingredient;

/**
 *
 * Product DAO Interface
 *
 * @author melnikov
 * @since 08.04.2015
 * @version 1.0.0
 *
 */
public interface IIngredientDAO {

    /**
     * Add Ingredient
     *
     * @param  Ingredient ingredient
     */
    public void addIngredient(Ingredient ingredient);

    /**
     * Update Ingredient
     *
     * @param  Ingredient ingredient
     */
    public void updateIngredient(Ingredient ingredient);

    /**
     * Delete Ingredient
     *
     * @param  Ingredient ingredient
     */
    public void deleteIngredient(Ingredient ingredient);

    /**
     * Get Ingredient
     *
     * @param  int ingredientId
     */
    public Ingredient getIngredientById(int id);

    /**
     * Get Ingredient List
     *
     */
    public List<Ingredient> getIngredients();
}
