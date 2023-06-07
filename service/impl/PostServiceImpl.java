package com.instagram.service.impl;

import com.instagram.model.User;
import com.instagram.model.UserPost;
import com.instagram.service.PostService;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

/**
 * Implements the post service of the user
 *
 * @author Arun
 * @version 1.1
 */
public class PostServiceImpl implements PostService {

    private static final Map<Long, List<UserPost>> USER_POSTS = new HashMap<>();

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean createPost(final User userDetail, final UserPost userPost) {
        List<UserPost> userPosts = USER_POSTS.getOrDefault(userDetail.getUserId(), new ArrayList<>());

        userPosts.add(userPost);
        USER_POSTS.put(userDetail.getUserId(), userPosts);

        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UserPost> getAllPost(final User userDetail) {
        return USER_POSTS.getOrDefault(userDetail.getUserId(), new ArrayList<>());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPost getPostDetail(final Integer postId, final User userDetail) {
        List<UserPost> posts = USER_POSTS.getOrDefault(userDetail.getUserId(), new ArrayList<>());

        for (int i = 0; i < posts.size(); i++) {

            if (posts.get(i).getPostId().equals(postId)) {
                return posts.get(i);
            }
        }

        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean deletePost(final Integer postId, final User userDetail) {
        List<UserPost> posts = USER_POSTS.getOrDefault(userDetail.getUserId(), new ArrayList<>());

        for (int i = 0; i < posts.size(); i++) {

            if (posts.get(i).getPostId().equals(postId)) {
                posts.remove(i);
                break;
            }

            return false;
        }
        USER_POSTS.put(userDetail.getUserId(), posts);

        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean updatePost(final User userDetail, final UserPost userPost) {
        List<UserPost> posts = USER_POSTS.getOrDefault(userDetail.getUserId(), new ArrayList<>());

        for (int i = 0; i < posts.size(); i++) {

            if (posts.get(i).getPostId().equals(userPost.getPostId())) {
                posts.set(i, userPost);
                break;
            }

            return false;
        }
        USER_POSTS.put(userDetail.getUserId(), posts);

        return true;
    }
}
