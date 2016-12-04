package com.upvhas.friendlychat;

/**
 * Created by user on 4/12/2016.
 */

public class FriendlyMessage {

    private String name;
    private String message;
    private String photoUrl;

    public FriendlyMessage() {
    }

    public FriendlyMessage(String name, String message, String photoUrl) {
        this.name = name;
        this.message = message;
        this.photoUrl = photoUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
