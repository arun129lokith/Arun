package com.instagram.controller;

import com.instagram.model.User;
import com.instagram.model.UserPost;
import com.instagram.service.PostService;
import com.instagram.service.impl.PostServiceImpl;

import java.util.Collection;

public class PostController {

    private static final PostService POST_SERVICE = new PostServiceImpl();

    /**
     * Creates the user post.
     *
     * @param userPost The user post details.
     */
    public boolean createPost(final User userDetail, final UserPost userPost) {
        return POST_SERVICE.createPost(userDetail, userPost);
    }

    public Collection<UserPost> getAllPost(final User userDetails) {
        return POST_SERVICE.getAllPost(userDetails);
    }

    public UserPost getPostDetail(final int postId) {
        return POST_SERVICE.getPostDetail(postId);
    }

    public boolean deletePost(final Integer postId, final User userDetail) {
        return POST_SERVICE.deletePost(postId, userDetail);
    }

    public boolean updatePost(final User userDetail, final UserPost userPost) {
        return POST_SERVICE.updatePost(userDetail, userPost);
    }
}
