package com.facefityoga.facefityoga.Models;

/**
 * Created by Greg on 11/11/2017.
 */

public class Pose {
    private String title;
    private int thumbnail;
    private boolean favorite;

    public Pose(){}

    public Pose(String title, int thumbnail, boolean favorite){
        this.title = title;
        this.thumbnail = thumbnail;
        this.favorite = favorite;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
