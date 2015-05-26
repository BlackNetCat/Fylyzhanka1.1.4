package com.fylyzhanka.managed;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.fylyzhanka.service.IIngredientService;
import org.springframework.dao.DataAccessException;

import com.fylyzhanka.model.Ingredient;


/**
 *
 * Ingredient Managed Bean
 *
 * @author melnikov
 * @since 08.05.2015
 * @version 1.0.0
 *
 */
@ManagedBean(name="ingredientMB")
@RequestScoped
public class IngredientManagerBean implements Serializable{

    private static final long serialVersionUID = 1L;

  //  private static final String EDINGREDIENT = "edingredient";
    private static final String DELETEINGREDIENT = "delingredient";
    private static final String SUCCESS2 = "success2";
    private static final String ERROR   = "error";

    //Spring Ingredient Service is injected...
    @ManagedProperty(value="#{IngredientService}")
    IIngredientService ingredientService;

    List<Ingredient> ingredientList;

    private int ingredientId;
    private String ingredientName;

    /**
     * Add Ingredient
     *
     * @return String - Response Message
     */
    public String addIngredient() {
        try {
            Ingredient ingredient = new Ingredient();
            ingredient.setIngredientId(getIngredientId());
            ingredient.setIngredientName(getIngredientName());
            getIngredientService().addIngredient(ingredient);
            return SUCCESS2;
        } catch (DataAccessException e) {
            e.printStackTrace();
        }

        return ERROR;
    }

    /**
     * Edit Ingredient
     *
     * @return String - Response Message
     */
    /*public String editIngredient() {
        try {
            Ingredient ingredient = new Ingredient();
            ingredient.setIngredientId(getIngredientId());
            ingredient.setIngredientName(getIngredientName());
            getIngredientService().updateIngredient(ingredient);
            return EDINGREDIENT;
        } catch (DataAccessException e) {
            e.printStackTrace();
        }

        return ERROR;
    }*/

    /**
     * Delete Ingredient
     *
     * @return String - Response Message
     */

    public String deleteIngredient() {
        try {
            Ingredient ingredient = new Ingredient();
            ingredient.setIngredientId(getIngredientId());
            getIngredientService().deleteIngredient(ingredient);
            return DELETEINGREDIENT;
        } catch (DataAccessException e) {
            e.printStackTrace();
        }

        return ERROR;
    }


    /**
     * Reset Fields
     *
     */
    public void reset() {
        this.setIngredientId(0);
        this.setIngredientName("");

    }

    /**
     * Get Ingredient List
     *
     * @return List - Product List
     */
    public List<Ingredient> getIngredientList() {
        ingredientList = new ArrayList<Ingredient>();
        ingredientList.addAll(getIngredientService().getIngredients());
        return ingredientList;
    }

    /**
     * Get Ingredient Service
     *
     * @return IIgredientService - Ingredient Service
     */
    public IIngredientService getIngredientService() {
        return ingredientService;
    }

    /**
     * Set Ingredient Service
     *
     * @param IIngredientService - Ingredient Service
     */
    public void setIngredientService(IIngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    /**
     * Set Ingredient List
     *
     * @param List - Ingredient List
     */
    public void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    /**
     * Get Ingredient Id
     *
     * @return int - Ingredient Id
     */
    public int getIngredientId() {
        return ingredientId;
    }

    /**
     * Set Ingredient Id
     *
     * @param int - ingredientId
     */
    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    /**
     * Get Ingredient Name
     *
     * @return String - Ingredient Name
     */
    public String getIngredientName() {
        return ingredientName;
    }

    /**
     * Set Ingredient Name
     *
     * @param String - Ingredient Name
     */
    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }
}
