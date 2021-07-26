package com.example.algorithm.algorithm.first;

/**
 * 局部最小的计算
 */
public class Demo05 {

    //arr整体无序，相邻的数不相等
    public static int oneMInIndex(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int n = arr.length;
        if (n == 1) {
            return 0;
        }
        if (arr[0] < arr[1]) {
            return 0;
        }
        if (arr[n - 1] < arr[n - 2]) {
            return n - 1;
        }
        int l = 0;
        int r = n - 1;
        while (l < r - 1) {
            int mid = (l + r) / 2;
            if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {// 4 左 > 我 我 < 右
                return mid;
            } else {
                // 我代指mid
                // 1 左 > 我 我 > 右   留右边
                // 2 左 < 我 我 < 右   留左边
                // 3 左 < 我 我 > 右   留左边
                if (arr[mid] > arr[mid - 1]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return arr[l] < arr[r] ? l : r;
    }

    /**
     * @param maxLen   生成数组的最大长度
     * @param maxValue 生成数组的最大值
     * @return
     */
    //生成相邻数据不相等的数组
    public static int[] createRandomArray(int maxLen, int maxValue) {
        int len = (int) (Math.random() * maxLen);
        int[] arr = new int[len];
        if (len > 0) {
            arr[0] = (int) (Math.random() * maxValue);
            for (int i = 1; i < len; i++) {
                do {
                    arr[i] = (int) (Math.random() * maxValue);
                } while (arr[i] == arr[i - 1]);
            }
        }
        return arr;
    }

    /**
     * @param arr 需要检查的数组
     * @param num 假定局域最小的值
     * @return
     */
    public static boolean check(int[] arr, int num) {
        if (arr.length == 0) {
            return num == -1;
        }
        int left = num - 1;
        int right = num + 1;
        boolean leftBigger = left >= 0 ? arr[left] > arr[num] : true;
        boolean rightBigger = right < arr.length ? arr[right] > arr[num] : true;
        return leftBigger && rightBigger;
    }

    /**
     * 打印数组
     *
     * @param arr
     */
    public static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int maxLen = 100;
        int maxValue = 2000;
        int time = 10000000;
        System.out.println("测试开始");
        for (int i = 0; i < time; i++) {
            int[] arr = createRandomArray(maxLen, maxValue);
            int ans = oneMInIndex(arr);
            if (!check(arr, ans)) {
                printArr(arr);
                System.out.println();
                break;
            }
        }
        System.out.println("测试结束");

    }
}
