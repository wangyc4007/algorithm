package com.example.algorithm.algorithm.first;

import org.springframework.util.ObjectUtils;

/**
 * @author Y~chao
 * @create 2021/6/30 15:30
 * <p>
 * 链表问题
 */
public class Demo08 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for(int j = 1; j <= (10-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
