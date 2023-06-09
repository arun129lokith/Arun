package com.instagram.service.impl;

import com.instagram.model.User;
import com.instagram.service.UserService;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Implements the service of the user
 *
 * @author Arun
 * @version 1.1
 */
public class UserServiceImpl implements UserService {

    private static final Map<String, User> USERS = new HashMap<>();

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean signUp(final User user) {
        if (USERS.containsKey(user.getEmail())) {
            System.out.println("User Email Is Already Exists");

            return false;
        }
        USERS.put(user.getEmail(), user);

        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean signIn(final User user) {
        if (USERS.containsKey(user.getEmail())) {
            final User existingUser = USERS.get(user.getEmail());

            return existingUser.getPassword().equals(user.getPassword());
        }

        for (final User existingUser : USERS.values()) {

            if (existingUser.getUserMobileNumber().equals(user.getUserMobileNumber())
                    && existingUser.getPassword().equals(user.getPassword())) {
                return true;
            }
        }

        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User getUser(final Long userId) {

        for (final User existingUser : USERS.values()) {

            if (userId.equals(existingUser.getUserId())) {
                return existingUser;
            }
        }

        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<User> getAllUsers() {
        return USERS.values();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isValidUpdate(final User user) {

        for (final User existingUser : USERS.values()) {

            if (existingUser.getUserId() == user.getUserId()) {
                existingUser.setUserName(user.getUserName());
                existingUser.setPassword(user.getPassword());
                existingUser.setEmail(user.getEmail());

                return true;
            }
        }

        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean deleteUserAccount(final String email) {

        if (USERS.containsKey(email)) {
            USERS.remove(email);

            return true;
        }

        return false;
    }
}

