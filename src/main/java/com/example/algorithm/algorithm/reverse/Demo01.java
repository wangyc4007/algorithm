package com.example.algorithm.algorithm.reverse;

/**
 * @author Y~chao
 * @create 2021/7/27 15:12
 *
 * 链表逆序
 */
public class Demo01 {

    //主测试函数
    public static void main(String[] args) {
//        Node n1 = new Node(1);
//        n1.next = new Node(2);
//        n1.next.next = new Node(3);
        DoubleNode n1 = new DoubleNode(1);
        n1.next = new DoubleNode(2);
        n1.next.next= new DoubleNode(3);

        System.out.println(n1.value);
        System.out.println(n1.next.value);
        System.out.println(n1.next.next.value);
        DoubleNode node = reverseDoubleLink(n1);
        System.out.println(node.value);
        System.out.println(node.next.value);
        System.out.println(node.next.next.value);

    }

    //双向链表反转方法====引用传递
    public static DoubleNode reverseDoubleLink(DoubleNode head){
        DoubleNode pre = null;
        DoubleNode next = null;
        while(head != null){
            next = head.next;
            head.next = pre;
            head.last = next;
            pre = head;
            head = next;
        }
        return pre;
    }

    //单链表反转函数===引用传递
    public static Node reverseLink(Node head){
        Node pre = null;
        Node next = null;
        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
    //单链表
    public static class Node{
        private int value;
        private Node next;
        private Node(int value){
            this.value = value;
        }
    }
    //双向链表
    public static class DoubleNode{
        private int value;
        private DoubleNode next;
        private DoubleNode last;
        private DoubleNode(int value){
            this.value = value;
        }
    }
}