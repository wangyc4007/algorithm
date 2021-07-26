package com.example.algorithm.algorithm.first;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Y~chao
 * @create 2021/6/29 15:04
 */
public class Test {

    public static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("不需要排序");
        }
        for (int i = 0; i < arr.length; i++) {
            int minValueIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minValueIndex = arr[j] < arr[minValueIndex] ? j : minValueIndex;
            }
            swap(arr, i, minValueIndex);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void maopao(int[] arr){
        if (arr == null || arr.length < 2) {
            System.out.println("不需要排序");
        }
        for(int end = arr.length -1;end >= 0; end-- ){
            for(int i = 0; i < end; i++){
                if(arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                }
            }
        }
    }

    public static int[] createArray(int maxLen, int maxValue) {
        int len = (int) (Math.random() * maxLen);
        if(len < 1){
            System.out.println(len + "没有值！！！");
        }
        System.out.println("l= " + len  + "   v=" + maxValue);
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = (int) (Math.random() * maxValue);
        }
        return arr;
    }

    public static void insertSort(int[] arr){
        if (arr == null || arr.length < 2) {
            System.out.println("不需要排序");
        }
        for(int end = 1; end < arr.length; end++){
            int curNumIndex = end;
            while(curNumIndex-1 >= 0 && arr[curNumIndex - 1] > arr[curNumIndex]){
                swap(arr, curNumIndex -1, curNumIndex);
                curNumIndex--;
            }
        }
    }

    public static void print(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        int maxLen = 10;
        int maxValue = 20;
        int time = 100;
        for (int i = 0; i < time; i++) {
            int[] array = createArray(maxLen, maxValue);
            print(array);
//            selectSort(array);
//            maopao(array);
            insertSort(array);
            print(array);
        }
    }
}
