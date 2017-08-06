package com.snowman.blog.model;

import java.io.Serializable;

/**
 * Created by SnowMan on 2017/7/9.
 */
public class Category implements Serializable {

    private static final long serialVersionUID = -8281438523311501569L;

    private Integer id;
    private String categoryName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
