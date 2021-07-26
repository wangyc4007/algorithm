package com.example.algorithm.test;

import java.io.Serializable;

/**
 * @author Y~chao
 * @create 2021/7/20 15:04
 */
public class Person implements Serializable {
    private int age;
    public String name;

    private void eat(){
        System.out.println("person---eat");
    }
    public void sleep(){
        System.out.println("person---sleep");
    }
}
