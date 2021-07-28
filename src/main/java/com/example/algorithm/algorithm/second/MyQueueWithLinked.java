package com.example.algorithm.algorithm.second;

/**
 * @author Y~chao
 * @create 2021/7/28 16:20
 * 链表实现队列：FIFO先进先出
 */
public class MyQueueWithLinked {
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
    public static class MyQueue<V>{
        private Node<V> head;
        private Node<V> tail;
        private int size;
        //无参构造
        public MyQueue(){
            head = null;
            tail = null;
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
        //新增节点
        public void offer(V value){
            Node<V> cur = new Node<>(value);
            //如果遇到的是第一个节点
            if(tail == null){
                head = cur;
                tail = cur;
            }else{
                //不是第一个节点，往尾部加入数据
                //tail.next指针转移
                tail.next = cur;
                //尾部探针指向最后一个值
                tail = cur;
            }
            size++;
        }
        //节点弹出：删除第一个进来的节点，head指针转移到下一个节点
        public V poll(){
            V ans = null;
            if(head != null){
                //如果head不为空，获取到head节点的value
                ans = head.value;
                //head指针转移到下一个节点
                head = head.next;
                //队列长队减一
                size--;
            }else{
                //画图更明白，需要尾巴和head保持一致，否则会出现脏数据
                tail = null;
            }
            return ans;
        }
        //不删除节点，只是取第一个值
        public V peek(){
            V ans = null;
            if(head != null){
                ans = head.value;
            }
            return ans;
        }
    }
}
