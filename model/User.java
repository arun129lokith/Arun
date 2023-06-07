package com.instagram.model;

/**
 * Represents the user detail
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

    public String getUserMobileNumber() {
        return mobileNumber;
    }

    public void setUserMobileNumber(final String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(final String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public String toString() {
        return String.format("UserId = %s \tUserName = %s \tUserMobileNumber = %s \tUserEmail = %s",
                              userId, userName, mobileNumber, email);
    }
}
