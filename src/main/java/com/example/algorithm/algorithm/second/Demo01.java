package com.example.algorithm.algorithm.second;

import org.junit.Test;

/**
 * @author Y~chao
 * @create 2021/7/21 16:22
 */
public class Demo01 {


    //选择排序，从头开始，和后边依次进行比较大小，小的放最前面，之后从第二个位置开始，依次排序，循环到最后一个位置
    public static void selectSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        // 0 ~ n
        // 1 ~ n
        // 2 ~ n
        // 3 ~ n
        for(int i = 0; i < arr.length; i++){
            //记录最小值的索引
            int minIndex = i;
            //因为第一个位置只有一个数，索引不用排序，从第二个位置开始
            for(int j = i + 1; j < arr.length; j++){
                //   2,4,6,8,1,4,2,6,9
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr, i, minIndex);
        }
    }

    //冒泡排序，从0索引开始 两两进行比较，大的放后边，比较到最后一个值后，最大的放最后，第二次循环的时候，最后一个不用进行比较
    //第二次循环的时候，从0~length-1
    //第三次循环的时候，从0~length-2
    //依次类推
    public static void bubbleSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        for(int i = arr.length - 1; i >= 0; i--){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);
                }
            }
        }
    }
    //从第一个位置开始，
    // 0-0进行排序，
    // 0-1进行排序，
    // 0-2进行排序
    // 0-n进行排序
    public static void insertSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }

        for(int i = 1; i < arr.length; i++){
            int index = i;
            while(index-1 >= 0 && arr[index-1] > arr[index]){
                swap(arr, index-1, index);
                index--;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {2,9,4,8,1,4,2,6,9};
        print1(arr);
//        selectSort(arr);
//        bubbleSort(arr);
        insertSort(arr);
        print1(arr);
    }

    public static void swap(int[] arr, int i, int j){
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }

    protected static void print1(int[] num){
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    @Test
    public void test01() {
        int num = 1;

        int a = 5;
        int b = ~a + 1;
        int c = ~b + 1;
        print(a);
        print(b);
        print(c);
        System.out.println("--------------------");
        print(-2);
        print(Integer.MAX_VALUE);
        print(Integer.MIN_VALUE);
    }

    public void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }
}
