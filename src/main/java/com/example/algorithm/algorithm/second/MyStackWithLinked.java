package com.example.algorithm.algorithm.second;

/**
 * @author Y~chao
 * @create 2021/7/28 16:20
 * 链表实现栈结构：先进后出，后进先出
 */
public class MyStackWithLinked {
    //单链表
    public static class Node<V>{
        private V value;
        private Node<V> next;
        private Node(V value){
            this.next = null;
            this.value = value;
        }
    }

    //模拟实现一个队列
    public static class MyStack<V>{
        private Node<V> head;
        private int size;
        //无参构造
        public MyStack(){
            head = null;
            size = 0;
        }
        //判断是否为空
        public boolean isEmpty(){
            return size == 0;
        }
        //队列长度
        public int size(){
            return size;
        }
        //添加数据，新增数据
        public void push(V value){
            Node<V> cur = new Node<>(value);
            if(head == null){
                head = cur;
            }else{
                //当前新建的节点指向head节点
                cur.next = head;
                //head指向转移到新增节点位置
                head = cur;
            }
            size++;
        }

        //节点弹出
        public V pop(){
            V ans = null;
            if(head != null){
                ans = head.value;
                head = head.next;
                size--;
            }
            return ans;
        }
    }
}
