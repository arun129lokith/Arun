package com.instagram.view;

import com.instagram.controller.PostController;
import com.instagram.model.User;
import com.instagram.model.UserPost;
import com.instagram.view.validation.UserValidation;

import java.util.Scanner;


public class PostView {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final PostController POST_CONTROLLER = new PostController();
    private static final UserView USER_VIEW = new UserView();
    private static final UserValidation USER_VALIDATION = new UserValidation() ;
    private static Integer postId = 0;

    /**
     * Prints the post menu of the user.
     */
    public void postMenu(final User user) {
        System.out.println(String.join(" ","Click 1 To Create Post\nClick 2 To Display Post",
                "\nClick 3 To Delete Post\nClick 4 To Update Post\nDo You Want To Continue Press 'Any Word' And Press",
                "'No' For User Screen\nEnter Your Message:"));

        if (USER_VALIDATION.isExit(SCANNER.nextLine())) {
            USER_VIEW.userScreen();
        }

        switch (USER_VIEW.getChoice()) {
            case 1:
                createPost(user);
                break;
            case 2:
                displayAllPost();
                break;
            case 3:
                deletePost();
                break;
            case 4:
                updatePost();
                break;
            case 5:
                getPostDetail();
                break;
            default:
                System.out.println("Invalid User Choice. Please Enter The Choice In The Range[1-5]");
                postMenu(user);
                break;
        }
    }

    private void createPost(final User user) {
        final UserPost userPost = new UserPost();

        userPost.setPostId(++postId);
        userPost.setUserLocation(getLocation());
        userPost.setUserCaption(getCaption());
        System.out.println("Enter The User Id For User To Create Post");
        final User getUserDetail = USER_VIEW.getUser();

        POST_CONTROLLER.createPost(getUserDetail, userPost);
        System.out.println("User Posted Successfully");
        postMenu(user);
    }

    public void displayAllPost() {
        final User userDetails = USER_VIEW.getUser();

        System.out.println(POST_CONTROLLER.getAllPost(userDetails));
    }

    public UserPost getPostDetail() {
        System.out.println("Enter Your PostId:");
        //System.out.println(POST_CONTROLLER.getPostDetail(Integer.valueOf(SCANNER.nextLine())));

        return POST_CONTROLLER.getPostDetail(Integer.valueOf(SCANNER.nextLine()));
    }

    public void deletePost() {
        final User userDetail = USER_VIEW.getUser();

        System.out.println("Enter Your PostId:");
        System.out.println(POST_CONTROLLER.deletePost(Integer.valueOf(SCANNER.nextLine()), userDetail) ?
                "Post Deleted Successfully" : "Post Not Found");
    }

    private void updatePost() {
        final UserPost userPost = new UserPost();
        final UserPost postDetail = getPostDetail();
        final User userDetail = USER_VIEW.getUser();

        System.out.println(String.join(" ","Do You Want to Edit User Caption Press 'Any Word' Else",
                "Press 'No' For Skip The Edit For User Caption"));

        if (USER_VALIDATION.isExit(SCANNER.nextLine())) {
            userPost.setUserCaption(postDetail.getUserCaption());
        } else {
            userPost.setUserCaption(getCaption());
        }
        System.out.println("Do You Want to Edit Password Press Any Word Else Press No For Skip The Edit User Password");

        if (USER_VALIDATION.isExit(SCANNER.nextLine())) {
            userPost.setUserLocation(postDetail.getUserLocation());
        } else {
            userPost.setUserLocation(getLocation());
        }

        if (POST_CONTROLLER.updatePost(userDetail, userPost)) {
            System.out.println("User Post Updated Successfully");
        } else {
            System.out.println("User Post Not Updated");
            updatePost();
        }
    }

    /**
     * Gets user location.
     *
     * @return The location of the user.
     */
    private String getLocation() {
        System.out.println("Enter Your Location Of Your Post:");

        return SCANNER.nextLine();
    }

    /**
     * Gets user caption.
     *
     * @return The caption of the user.
     */
    private String getCaption() {
        System.out.println("Enter Your Caption:");

        return SCANNER.nextLine();
    }
}



