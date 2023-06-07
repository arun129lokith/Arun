package com.instagram.service;

import com.instagram.model.User;
import com.instagram.model.UserPost;

import java.util.Collection;

/**
 * Provides post service for the user
 *
 * @author Arun
 * @version 1.1
 */
public interface PostService {

    /**
     * Creates the user post.
     *
     * @param userDetail The user details
     * @param userPost   The post detail of the user
     * @return True if post is created, false otherwise
     */
    boolean createPost(final User userDetail, final UserPost userPost);

    /**
     * Gets the all post of the user
     *
     * @param userDetail The user details
     * @return The collection of post
     */
    Collection<UserPost> getAllPost(final User userDetail);

    /**
     * Gets the post detail of the user
     *
     * @param postId The post id of the user
     * @param userDetail The user details
     * @return The post details of the user
     */
    UserPost getPostDetail(final Integer postId, final User userDetail);

    /**
     * Deletes the user post
     *
     * @param postId The post id of the user
     * @param userDetail The user details
     * @return True if post is deleted, false otherwise
     */
    boolean deletePost(final Integer postId, final User userDetail);

    /**
     * Updates the user post details
     *
     * @param userDetail The user details
     * @param userPost The post of the user
     * @return True if post is updated, false otherwise
     */
    boolean updatePost(final User userDetail, final UserPost userPost);
}
