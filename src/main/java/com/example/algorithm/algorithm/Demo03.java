package com.example.algorithm.algorithm;

/**
 * 对数器
 */
public class Demo03 {

    public static void main(String[] args) {
//        int[] arr = {3, 4, 7, 5, 1, 9, 3};
//        print(arr);
//        selectSort(arr);
//        bubbleSort(arr);
//        insert(arr);
//        print(arr);
        int maxLen = 200;
        int maxValue = 300;
        int loopTime = 10000;
        for(int i = 0; i < loopTime; i++){
            int[] arr1 = lenRandomValueRandom(maxLen, maxValue);
            int[] arr2 = copyArr(arr1);
            insert(arr1);
            bubbleSort(arr2);
            if(!isSort(arr1)){
                System.out.println("插入排序错误");
            }
            if(!isSort(arr2)){
                System.out.println("冒泡排序错误");
            }
        }
        System.out.println("···········结束··········");
    }

    //生成一个随机数组
    public static int[] lenRandomValueRandom(int maxLen, int maxValue){
        int len = (int)(Math.random() * maxLen);
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = (int) (Math.random() * maxValue);
        }
        return arr;
    }

    //拷贝一个数组，用来做对照用
    public static int[] copyArr(int[] arr){
        int[] arr1 = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            arr1[i] = arr[i];
        }
        return arr1;
    }

    //判断当前数组是否是升序的
    public static boolean isSort(int[] arr){
        if(arr.length < 2 || arr == null){
            return true;
        }
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(max > arr[i]){
                return false;
            }
            max = Math.max(max, arr[i]);
        }
        return true;
    }



    //插入排序
    public static void insert(int[] arr){
        if (arr == null || arr.length < 2) {
            return;
        }
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
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for(int end = arr.length - 1; end > 0; end-- ){
            for(int i = 0; i < end; i++){
                if(arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                }
            }
        }

    }
    //选择排序
    public static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minValueIndex = i;
            for (int j = i + 1; j < n; j++) {
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

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
