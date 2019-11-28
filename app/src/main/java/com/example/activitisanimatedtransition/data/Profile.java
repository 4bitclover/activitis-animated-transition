package com.example.activitisanimatedtransition.data;

import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;




public class Profile extends ArrayList<Parcelable> implements Serializable {
    private String name;
    private String bio;
    private int image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
