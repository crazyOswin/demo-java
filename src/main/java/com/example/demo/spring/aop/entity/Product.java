package com.example.demo.spring.aop.entity;

import java.io.Serializable;

/**
 * Description: 描述
 *
 * @author : wangjianzhi
 * Create on 2018/11/1
 */
public class Product implements Serializable {
    private static final long serialVersionUID = -1881352617259992350L;
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
