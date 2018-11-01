package com.example.demo.spring.aop.util;

import org.springframework.stereotype.Component;

/**
 * Description: 描述
 *
 * @author : wangjianzhi
 * Create on 2018/11/1
 */
@Component
public class AuthService {
    public void checkAccess(){
        String user = UserHodler.get();
        if (!"admin".equals(user)){
            throw new RuntimeException("operation not allow");
        }
    }
}
