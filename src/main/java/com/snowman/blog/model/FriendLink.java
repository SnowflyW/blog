package com.snowman.blog.model;

import java.io.Serializable;

/**
 * Created by SnowMan on 2017/7/9.
 */
public class FriendLink implements Serializable{

    private static final long serialVersionUID = -2602997021417561798L;

    private Integer id;
    private String title;
    private String url;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
