package com.instagram.service.impl;

import com.instagram.model.User;
import com.instagram.model.UserPost;
import com.instagram.service.PostService;

import java.util.*;


public class PostServiceImpl implements PostService {

    private static final Map<Long, List<UserPost>> USER_POSTS = new HashMap<>();

    @Override
    public boolean createPost(final User userDetail, final UserPost userPost) {
        List<UserPost> userPosts = USER_POSTS.getOrDefault(userDetail.getUserId(), new ArrayList<>());

        userPosts.add(userPost);
        USER_POSTS.put(userDetail.getUserId(), userPosts);

        return true;
    }

    @Override
    public List<UserPost> getAllPost(final User userDetail) {
        return USER_POSTS.getOrDefault(userDetail.getUserId(), new ArrayList<>());
    }

    @Override
    public UserPost getPostDetail(final int postId) {

        for (final UserPost existingPost : USER_POSTS) {

            if (existingPost.getPostId() == postId) {
                return existingPost;
            }
        }

        return null;
    }

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
