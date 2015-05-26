package com.fylyzhanka.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * User Entity
 *
 * @author melnikov
 * @since 08.04.2015
 * @version 1.0.0
 *
 */
@Entity
@Table(name="USER")
public class User {

    private int id;
    private String password;
    private String firstName;
    private String lastName;
    private String patronymic;
    private boolean active;


    /**
     * Get User Id
     *
     * @return int - User Id
     */
    @Id
    @Column(name="ID", unique = true, nullable = false)
    public int getId() {
        return id;
    }

    /**
     * Set User id
     *
     * @param int - User id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get User password
     *
     * @return String - User password
     */
    @Column(name="PASSWORD", nullable = false)
    public String getPassword() {
        return password;
    }

    /**
     * Set User password
     *
     * @param String - User password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get User firstName
     *
     * @return String - User firstName
     */
    @Column(name="FIRSTNAME", nullable = false)
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set User firstName
     *
     * @param String - User firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    /**
     * Get User lastName
     *
     * @return String - User lastName
     */
    @Column(name="LASTNAME", nullable = false)
    public String getLastName() {
        return lastName;
    }

    /**
     * Set User lastName
     *
     * @param String - User lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    /**
     * Get User patronymic
     *
     * @return String - User patronymic
     */
    @Column(name="PATRONYMIC", nullable = false)
    public String getPatronymic() {
        return patronymic;
    }

    /**
     * Set User patronymic
     *
     * @param String - User patronymic
     */
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    /**
     * Get User active
     *
     * @return boolean - User active
     */
    @Column(name="ACTIVE", nullable = false)
    public boolean getActive() {
        return active;
    }

    /**
     * Set User active
     *
     * @param  - User active
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        StringBuffer strBuff = new StringBuffer();
        strBuff.append("id : ").append(getId());
        strBuff.append(", firstname : ").append(getFirstName());
        strBuff.append(", lastname : ").append(getLastName());
        return strBuff.toString();
    }
}