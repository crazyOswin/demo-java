package com.example.demo.spring.aop.service;

import com.example.demo.spring.aop.entity.Product;

/**
 * Description: 描述
 *
 * @author : wangjianzhi
 * Create on 2018/11/1
 */
public interface IProductService {

    public void insert(Product product);

    public void delete(long id);
}
