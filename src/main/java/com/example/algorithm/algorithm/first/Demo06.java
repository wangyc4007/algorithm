package com.example.algorithm.algorithm.first;

import java.time.LocalDate;
import java.util.*;

/**
 * @author Y~chao
 * @create 2021/6/30 15:30
 * <p>
 * 链表问题
 */
public class Demo06 {

    public static class Node {
        public int value;
        public Node next;
        public Node(int data) {
            this.value = data;
        }
    }

    public static class DoubleNode {
        public int value;
        public DoubleNode next;
        public DoubleNode last;
        public DoubleNode(int data) {
            this.value = data;
        }
    }

    public static void main(String[] args) {
        System.out.println(Double.compare(12.3, 12.3));
        System.out.println(Integer.compare(1,2));
        System.out.println(Objects.equals("NIHAO".toLowerCase(), "nihao"));

        List list = new ArrayList<>();
        list.add("111");
        ArrayList<String> objects = new ArrayList<>();
        objects.add("123");
        String str = "PCF/ericssonPCF2/192.168.3.216";
        System.out.println(str.substring(0, 3));
        System.out.println("==========================");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        int n = -1 >>> Integer.numberOfLeadingZeros(10 - 1);
        System.out.println(Integer.numberOfLeadingZeros(9));
        System.out.println("n=== " + n);
        System.out.println("==========================");
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("",1);
        System.out.println(1<<30);
        System.out.println("==========================");
        System.out.println(2^111);
    }

}
