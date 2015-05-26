package com.fylyzhanka.dao;

import com.fylyzhanka.model.Ingredient;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 *
 * Ingredient DAO
 *
 * @author melnikov
 * @since 08.04.2015
 * @version 1.0.0
 *
 */

public class IngredientDAO implements IIngredientDAO{

    private SessionFactory sessionFactory;

    /**
     * Get Hibernate Session Factory
     *
     * @return SessionFactory - Hibernate Session Factory
     */
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    /**
     * Set Hibernate Session Factory
     *
     * @param SessionFactory - Hibernate Session Factory
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    /**
     * Add Ingredient
     *
     * @param  Ingredient ingredient
     */

    @Override
    public void addIngredient(Ingredient ingredient) {
        getSessionFactory().getCurrentSession().save(ingredient);

    }

    /**
     * Update Ingredient
     *
     * @param  Ingredient ingredient
     */

    @Override
    public void updateIngredient(Ingredient ingredient) {
        getSessionFactory().getCurrentSession().update(ingredient);
    }

    /**
     * Delete Ingredient
     *
     * @param  Ingredient ingredient
     */

    @Override
    public void deleteIngredient(Ingredient ingredient) {
        getSessionFactory().getCurrentSession().delete(ingredient);
    }

    /**
     * Get Ingredient
     *
     * @param  int ingredientId
     * @return Ingredient
     */
    @Override
    public Ingredient getIngredientById(int id) {
        List list = getSessionFactory().getCurrentSession()
                .createQuery("from Ingredient where id=?")
                .setParameter(0, id).list();
        return (Ingredient)list.get(0);
    }

    /**
     * Get Ingredient List
     *
     * @return List - Ingredient list
     */
    @Override
    public List<Ingredient> getIngredients() {
        List list = getSessionFactory().getCurrentSession().createQuery("from Ingredient").list();
        return list;
    }
}
