package com.instagram.controller;

import com.instagram.model.User;
import com.instagram.model.UserPost;
import com.instagram.service.PostService;
import com.instagram.service.impl.PostServiceImpl;

import java.util.Collection;

/**
 * Communicates with service provider and user
 */
public class PostController {

    private static final PostService POST_SERVICE = new PostServiceImpl();

    /**
     * Creates the user post.
     *
     * @param userDetail  The user details
     * @param userPost The post detail of the user
     * @return True if post is created, false otherwise
     */
    public boolean createPost(final User userDetail, final UserPost userPost) {
        return POST_SERVICE.createPost(userDetail, userPost);
    }

    /**
     * Gets the all post of the user
     *
     * @param userDetails The user details
     * @return The collection of post
     */
    public Collection<UserPost> getAllPost(final User userDetails) {
        return POST_SERVICE.getAllPost(userDetails);
    }

    /**
     * Gets the post detail of the user
     *
     * @param postId The post id of the user
     * @param userDetail The user details
     * @return The post details of the user
     */
    public UserPost getPostDetail(final Integer postId, final User userDetail) {
        return POST_SERVICE.getPostDetail(postId, userDetail);
    }

    /**
     * Deletes the user post
     *
     * @param postId The post id of the user
     * @param userDetail The user details
     * @return True if post is deleted, false otherwise
     */
    public boolean deletePost(final Integer postId, final User userDetail) {
        return POST_SERVICE.deletePost(postId, userDetail);
    }

    /**
     * Updates the user post details
     *
     * @param userDetail The user details
     * @param userPost The post of the user
     * @return True if post is updated, false otherwise
     */
    public boolean updatePost(final User userDetail, final UserPost userPost) {
        return POST_SERVICE.updatePost(userDetail, userPost);
    }
}
