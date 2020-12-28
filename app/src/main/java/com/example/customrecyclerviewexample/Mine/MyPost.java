package com.example.customrecyclerviewexample.Mine;

public class MyPost {

    private String name;
    private int icon;
    private String time;
    private String caption;
    private int image;

    public MyPost(String name, int icon, String time, String caption, int image) {
        this.name = name;
        this.icon = icon;
        this.time = time;
        this.caption = caption;
        this.image = image;
    }

    public MyPost(String name, int icon, String time, String caption) {
        this(name,icon,time,caption,-1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
