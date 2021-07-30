package com.gawor.tutorials.designpatterns.youtubelib;

public class Video {
    public int id;
    public String title;
    public String info;
    public String data;

    Video(int id, String title, String info) {
        this.id = id;
        this.title = title;
        this.info = info;
        this.data = "Video data format";
    }

    @Override
    public String toString() {
        return "Video{" + title + ": " + data + "}";
    }
}
