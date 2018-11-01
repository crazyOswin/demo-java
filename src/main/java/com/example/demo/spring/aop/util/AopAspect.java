package com.example.demo.spring.aop.util;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Description: 描述
 *
 * @author : wangjianzhi
 * Create on 2018/11/1
 */
@Aspect
@Component
public class AopAspect {

    @Autowired
    private AuthService authService;

    @Pointcut("@annotation(AdminOnly)")
    public void adminOnly(){

    }

    @Before("adminOnly()")
    public void check(){
        authService.checkAccess();
    }
}
