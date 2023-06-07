package com.instagram.view.validation;

/**
 * Handles the validation of the user details.
 *
 * @author Arun
 * @version 1.1
 */
public class UserValidation {

    /**
     * Validates the username of the user.
     *
     * @param userName The username of the user.
     * @return True if username is valid, false otherwise.
     */
    public boolean validateUserName(final String userName) {
        return userName.matches("^[a-zA-Z0-9]+(\\s[a-zA-z0-9]+)*{6,20}$");
    }

    /**
     * Validates the email of the user.
     *
     * @param email The email of the user.
     * @return True if email is valid, false otherwise.
     */
    public boolean validateEmail(final String email) {
        return email.matches("^[a-z[0-9]_.-]+@[a-z]{5,10}.[a-z]{2,3}$");
    }

    /**
     * Validates the password of the user.
     *
     * @param password The password of the user.
     * @return True if password is valid, false otherwise.
     */
    public boolean validatePassword(final String password) {
        return password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$");
    }

    /**
     * Validates the mobile number of the user.
     *
     * @param mobileNumber The mobile number of yhe user.
     * @return True if mobile number is valid, false otherwise.
     */
    public boolean validateMobileNumber(final String mobileNumber) {
        return mobileNumber.matches("^[6-9][0-9]{9}$");
    }

    /**
     * Goes to main menu of the application.
     *
     * @param userInput The input of the user details.
     */
    public boolean exitOption(final String userInput) {
        if (userInput.contains("!")) {
            return true;
        }

        return false;
    }

    public boolean isExit(final String exit) {
        return "No".equalsIgnoreCase(exit) || "N".equalsIgnoreCase(exit);
    }
}


