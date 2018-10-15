package com.perul.vanshika.concetto.Models;

/**
 * Created by shridhar on 28-Sep-18.
 */

public class Category
{
    private String image, title;

    public Category(String image, String title) {
        this.image = image;
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }
}
