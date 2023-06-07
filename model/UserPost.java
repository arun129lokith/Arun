package com.instagram.model;

public class UserPost {

    private User userDetail;
    private Integer postId;
    private String caption;
    private String location;

    public User getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(final User userDetail) {
        this.userDetail = userDetail;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(final Integer postId) {
        this.postId = postId;
    }

    public String getUserCaption() {
        return caption;
    }

    public void setUserCaption(final String caption) {
        this.caption = caption;
    }

    public String getUserLocation() {
        return location;
    }

    public void setUserLocation(final String location) {
        this.location = location;
    }

    public String toString() {
        return String.format("UserPostId = %d, \tUserCaption = %s, \tUserLocation = %s", postId, caption, location);
    }
}
