package com.example.demo.spring.aop.service;

import com.example.demo.spring.aop.entity.Product;
import com.example.demo.spring.aop.util.AdminOnly;
import com.example.demo.spring.aop.util.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description: 描述
 *
 * @author : wangjianzhi
 * Create on 2018/11/1
 */
@Service(value = "productService")
public class ProductService implements IProductService {

    @Autowired
    private AuthService authService;
    @Override
    @AdminOnly
    public void insert(Product product) {
        System.out.println("insert product");
    }

    @Override
    @AdminOnly
    public void delete(long id) {
        System.out.print("delete product");
    }
}
