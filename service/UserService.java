package com.instagram.service;

import com.instagram.model.User;
import com.instagram.model.UserPost;

import java.util.Collection;
import java.util.Map;

/**
 * Defines the features for the application.
 */
public interface UserService {

    /**
     * Sign up a new user with user details of user class.
     *
     * @param user The user object containing the details of the user.
     * @return True if sign-up is successful, false otherwise.
     */
    boolean signUp(final User user);

    /**
     * Sign in a new user with user details of user class.
     *
     * @param user The user object containing the details of the user.
     * @return True if sign-in is successful, false otherwise.
     */
    boolean signIn(final User user);

    /**
     * Gets the user details of the user.
     *
     * @param userId The userid of the user.
     * @return The user details.
     */
    User getUser(final Long userId);

    /**
     * Collects the all user information.
     *
     * @return The collection of user details.
     */
    Collection<User> getAllUsers();

    /**
     * Creates the user post.
     *
     * @param userPost The user post details.
     */
    //void createPost(final UserPost userPost);

    /**
     * Display All post of the user.
     *
     * @param userId The userId of the user.
     * @return The post of the user
     */
    //Map<Long, UserPost> displayAllPosts(final long userId);

    /**
     * Updates the user details
     *
     * @param user The user object contains user details.
     * @return True if user details is update, false otherwise
     */
    boolean isValidUpdate(final User user);

    /**
     * deletes the user account details.
     *
     * @param email The email of the user.
     * @return True if account is deleted, false otherwise.
     */
    boolean deleteUserAccount(final String email);

    // void createPost(final UserPost userPost);
}
