package com.example.demo.spring.aop.util;

/**
 * Description: 描述
 *
 * @author : wangjianzhi
 * Create on 2018/11/1
 */
public class UserHodler {

    private static final ThreadLocal<String> holder = new ThreadLocal<>();

    public static String get(){
        return null == holder.get() ? "unkonw" : holder.get();
    }

    public static void set(String user){
        holder.set(user);
    }
}
