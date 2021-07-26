package com.example.algorithm.algorithm.first;

/**
 * 随机数
 */
public class Demo02 {

    public static void main(String[] args) {

        // 题目：存在一个生成1-5随机数的函数
        // 目标：实现一个生成1-7随机数的函数
        int[] arr = new int[8];
        for(int i = 0; i < 100000; i++){
            int num = f3();
            arr[num]++;
        }
        for(int j = 0; j < arr.length; j++){
            System.out.println(j + "这个数出现 " + arr[j] + " 次");
        }
        // 题目：存在一个函数，生成不等概率的0和1
        // 目标：制作一个生成一个相等概率0和1的函数
        // 解：（0-0 X   1-1 X）不要，因为概率相加不是1  只要（1-0 和 0-1）因为概率相加等于1
        System.out.println("+++++++++++++");
        arr = new int[2];
        for(int i = 0; i < 100000; i++){
            arr[y()]++;
        }
        for(int j = 0; j < arr.length; j++){
            System.out.println(j + "这个数出现 " + arr[j] + " 次");
        }

    }

    public static int x(){
        return Math.random() < 0.84 ? 0 : 1;
    }

    public static int y(){
        int ans = 0;
        do{
            ans = x();
        }while(ans == x());
        return ans;
    }

    public static int f(){
        return (int) (Math.random() * 5) + 1 ;
    }

    public static int f1(){
        int ans = 0;
        do{
            ans = f();
        }while(ans == 3);
        return ans < 3 ? 0:1;
    }

    public static int f2(){
        int nums = (f1() << 2) + (f1() << 1) + (f1() << 0);
        return nums;
    }

    public static int f3(){
        int ans = 0;
        do{
            ans = f2();
        }while (ans == 0);//排除0，只要1-7
        return ans;
    }

    public static double f99(){
        return  (Math.random() * 5) + 1 ;
    }
}
