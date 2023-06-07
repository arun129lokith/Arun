package com.instagram.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the user
 *
 * @author Arun
 * @version 1.1
 */
public class User {

    private Long userId;
    private String mobileNumber;
    private String userName;
    private String email;
    private String password;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(final Long userId) {
        this.userId = userId;
    }

    /**
     * Gets mobile number of the user.
     *
     * @return The mobile number of the user.
     */
    public String getUserMobileNumber() {
        return mobileNumber;
    }

    /**
     * Set mobile number in the variable.
     *
     * @param mobileNumber The mobile number of the user.
     */
    public void setUserMobileNumber(final String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    /**
     * Gets username detail of user.
     *
     * @return The username of the user.
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Set username in the variable.
     *
     * @param userName The username of the user.
     */
    public void setUserName(final String userName) {
        this.userName = userName;
    }

    /**
     * Gets email detail of user.
     *
     * @return The email of the user.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set email detail in the variable.
     *
     * @param email The email of the user.
     */
    public void setEmail(final String email) {
        this.email = email;
    }

    /**
     * Get password detail of user.
     *
     * @return The password of the user.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set user password in the variable.
     *
     * @param password The password of the user.
     */
    public void setPassword(final String password) {
        this.password = password;
    }

    /**
     * Represents user details to print in this format.
     *
     * @return The user details.
     */
    public String toString() {
        return String.format("UserId = %s \tUserName = %s \tUserMobileNumber = %s \tUserEmail = %s",
                              userId, userName, mobileNumber, email);
    }
}
