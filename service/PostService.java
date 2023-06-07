package com.instagram.service;

import com.instagram.model.User;
import com.instagram.model.UserPost;

import java.util.Collection;

public interface PostService {

    boolean createPost(final User userDetail, final UserPost userPost);

    Collection<UserPost> getAllPost(final User userDetail);

    UserPost getPostDetail(final int postId);

    boolean deletePost(final Integer postId, final User userDetail);

    boolean updatePost(final User userDetail, final UserPost userPost);
}
