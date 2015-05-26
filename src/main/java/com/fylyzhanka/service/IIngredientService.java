package com.fylyzhanka.service;

import com.fylyzhanka.model.Ingredient;

import java.util.List;

/**
 *
 * Ingredient Service Interface
 *
 * @author melnikov
 * @since 08.05.2015
 * @version 1.0.0
 *
 */
public interface IIngredientService {

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
    public Ingredient getIngredientById(int ingredientId);

    /**
     * Get Ingredient List
     *
     * @return List - Ingredient list
     */
    public List<Ingredient> getIngredients();
}
