package com.instagram.controller;

import com.instagram.model.User;
import com.instagram.model.UserPost;
import com.instagram.service.UserService;
import com.instagram.service.impl.UserServiceImpl;

import java.util.Collection;
import java.util.Map;

/**
 * Communicates with service provider and user
 *
 * @author Arun
 * @version 1.1
 */
public class UserController {

    private static final UserService USER_SERVICE = new UserServiceImpl();

    /**
     * Sign up a new user with user details of user class.
     *
     * @param user The user object contains details of the user.
     * @return True if sign-up is successful, false otherwise.
     */
    public boolean signUp(final User user) {
        return USER_SERVICE.signUp(user);
    }

    /**
     * Sign in a new user with user details of user class.
     *
     * @param user The user object contains details of the user.
     * @return True if sign-in is successful, false otherwise.
     */
    public boolean signIn(final User user) {
        return USER_SERVICE.signIn(user);
    }

    /**
     * Gets the user details of the user.
     *
     * @param userId The userid of the user.
     * @return The user details.
     */
    public User getUser(final long userId) {
        return USER_SERVICE.getUser(userId);
    }

    /**
     * Collects the all user information.
     *
     * @return The collection of user details.
     */
    public Collection<User> getAllUsers() {
        return USER_SERVICE.getAllUsers();
    }

    /**
     * Display All post of the user.
     *
     * @param userId The userId of the user.
     * @return The post of the user
     */
    /*public Map<Long, UserPost> displayAllPosts(final long userId) {
        return USER_SERVICE.displayAllPosts(userId);
    } */

    /**
     * Updates the user details
     *
     * @param user The user object contains user details.
     * @return True if user details is update, false otherwise
     */
    public boolean isValidUpdate(final User user) {
        return USER_SERVICE.isValidUpdate(user);
    }

    /**
     * deletes the user account details.
     *
     * @param email The email of the user.
     * @return True if account is deleted, false otherwise.
     */
    public boolean deleteUserAccount(final String email) {
        return USER_SERVICE.deleteUserAccount(email);
    }
}