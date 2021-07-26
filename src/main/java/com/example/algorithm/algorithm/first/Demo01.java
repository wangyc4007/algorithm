package com.example.algorithm.algorithm.first;

import org.junit.Test;

/**
 * @author Y~chao
 * @create 2021/6/23 15:44
 *
 * 排序
 */
public class Demo01 {

    /**
     * 位运算
     * 任何的整型底层都是32位表示，1 = 00000000000000000000000000000001（二进制表示）
     */
    @Test
    public void test01() {
        int num = 4;
        System.out.println(~4);
//        System.out.println(num<<1);
//        System.out.println(num*2);
//        System.out.println(num*2 == num<<1);
        demo(num);
        demo(-4);
        demo(-5);
        demo(~num);
        demo(num<<1);
        demo(num<<2);
        demo(num<<3);
    }

    public void demo(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    /**
     * 反码-补码
     */
    @Test
    public void test02() {
        int a = 12423423;
        int b = ~a;//~波浪号是取反的意思
        demo(a);
        demo(b);
    }

    /**
     *
     */
    @Test
    public void test03() {
        int a = 5;
        int b = 12;
        demo(a);
        demo(b);
        System.out.println("=======与或非=======");
        demo(a & b);
        demo(a | b);
        demo(a ^ b);
    }

    @Test
    public void test04() {
        int a = Integer.MIN_VALUE;
        int b = ~a;
        demo(a);
        demo(b);
        System.out.println(a);
        System.out.println(b);
    }

    @Test
    public void test05() {
        int[] arr = {3, 4, 7, 5, 1, 9, 3};
        print(arr);
        selectSort(arr);//选择排序
//        bubbleSort(arr);//冒泡排序
//        insert(arr);//插入排序
        print(arr);
    }
    //插入排序
    public void insert(int[] arr){
        if (arr == null || arr.length < 2) {
            return;
        }
        // 0 ~ 0
        int n = arr.length;
        for(int end = 1; end < n; end++){
            int newNumIndex = end;
            while(newNumIndex - 1 >= 0 && arr[newNumIndex - 1] > arr[newNumIndex] ){
                swap(arr, newNumIndex - 1, newNumIndex);
                newNumIndex--;
            }
        }
    }

    //冒泡排序
    public void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        //0   n-1
        //0   n-2
        //0   n-3
        //0   n-4
        for(int end = arr.length - 1; end > 0; end-- ){
            for(int i = 0; i < end; i++){
                if(arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                }
            }
        }

    }
    //选择排序
    public void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        //排序
        // 0 ---  n-1
        // 1 ---  n-1
        // 2 ---  n-1
        // 3 ---  n-1
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minValueIndex = i;
            for (int j = i + 1; j < n; j++) {
                minValueIndex = arr[j] < arr[minValueIndex] ? j : minValueIndex;
            }
            swap(arr, i, minValueIndex);
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //找到两数之和是指定数字
    public static void twoSum(int[] nums, int target) {
        int[] indexArr = {0,1,2};
        for(int i = 0; i < nums.length; i++){
            int index = i;
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    System.out.print(i + " " + j);
                    System.out.println();
                }
            }
        }
    }
    public static void main(String[] args){
        int[] nums = {8,4,2,7,8,3,9};
        int target = 16;
        twoSum(nums, target);
    }

}
