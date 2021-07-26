package com.example.algorithm.algorithm.first;

import java.util.*;

/**
 * @author Y~chao
 * @create 2021/6/30 15:30
 * <p>
 * 链表问题
 */
public class Demo07 {

    public static void main(String[] args) {
       for(int i = 1; i <= 9; i++){
           for(int j = 1; j <= i; j++){
               System.out.print(j + "*" + i + "=" + i*j + "\t");
           }
           System.out.println();
        }
        System.out.println();
       for(int i = 9; i >= 1; i--){
           for(int j = 1; j <= i; j++){
               System.out.print(j + "*" + i + "=" + i*j + "\t");
           }
           System.out.println();
        }
    }

}
