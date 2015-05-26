package com.fylyzhanka.service;


import com.fylyzhanka.dao.IIngredientDAO;
import com.fylyzhanka.model.Ingredient;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * Ingredient Service
 *
 * @author melnikov
 * @since 08.05.2015
 * @version 1.0.0
 *
 */
@Transactional(readOnly = true)
public class IngredientService implements IIngredientService{

    // IngredientDAO is injected...
    IIngredientDAO ingredientDAO;


    /**
     * Get Ingredient DAO
     *
     * @return IIngredientDAO - ingredientDAO
     */
    public IIngredientDAO getIngredientDAO() {
        return ingredientDAO;
    }

    /**
     * Set Ingredient DAO
     *
     * @param IIngredientDAO - ingredientDAO
     */
    public void setIngredientDAO(IIngredientDAO ingredientDAO) {
        this.ingredientDAO = ingredientDAO;
    }

    /**
     * Add Ingredient
     *
     * @param  Ingredient ingredient
     */
    @Transactional(readOnly = false)
    @Override
    public void addIngredient(Ingredient ingredient) {
        getIngredientDAO().addIngredient(ingredient);
    }

    /**
     * Update Ingredient
     *
     * @param  Ingredient ingredient
     */

    @Transactional(readOnly = false)
    @Override
    public void updateIngredient(Ingredient ingredient) {
        getIngredientDAO().updateIngredient(ingredient);
    }

    /**
     * Delete Ingredient
     *
     * @param  Ingredient ingredient
     */

    @Transactional(readOnly = false)
    @Override
    public void deleteIngredient(Ingredient ingredient) {
        getIngredientDAO().deleteIngredient(ingredient);
    }

    /**
     * Get Ingredient
     *
     * @param  int ingredientId
     */

    @Override
    public Ingredient getIngredientById(int ingredientId) {

        return getIngredientDAO().getIngredientById(ingredientId);
    }

    /**
     * Get Ingredient List
     *
     */

    @Override
    public List<Ingredient> getIngredients() {
        return getIngredientDAO().getIngredients();
    }
}
