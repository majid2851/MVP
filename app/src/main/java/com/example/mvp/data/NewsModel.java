package com.example.mvp.data;

public class NewsModel
{
    private String id;
    private String title;
    private String description;
    private String imageUrl;
    private String video;
    private String date;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getVideo() {
        return video;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", video='" + video + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
