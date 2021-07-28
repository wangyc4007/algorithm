package com.example.algorithm.algorithm.second;

/**
 * @author Y~chao
 * @create 2021/7/28 16:20
 * 双向链表实现双端队列：FIFO先进先出
 * 四个操作；头部加减，尾部加减
 * <p>
 * 注意单链表不能实现双端队列，因为单链表尾部删除的时候，为不找不到上一个节点
 */
public class MyQueueWithDoubleLinked {
    //双向链表
    public static class DoubleNode<V> {
        private V value;
        private DoubleNode next;
        private DoubleNode last;

        private DoubleNode(V value) {
            this.last = null;
            this.next = null;
            this.value = value;
        }
    }

    //模拟实现一个队列
    public static class MyDoubleQueue<V> {
        private DoubleNode<V> head;
        private DoubleNode<V> tail;
        private int size;

        //无参构造
        public MyDoubleQueue() {
            head = null;
            tail = null;
            size = 0;
        }

        //判断是否为空
        public boolean isEmpty() {
            return size == 0;
        }

        //队列长度
        public int size() {
            return size;
        }

        //新增头部节点
        public void pushHead(V value) {
            DoubleNode<V> cur = new DoubleNode<>(value);
            if (head != null) {
                cur.next = head;
                head.last = cur;
                head = cur;
            } else {
                head = cur;
                tail = cur;
            }
            size++;
        }

        //新增尾部节点
        public void pushTail(V value) {
            DoubleNode<V> cur = new DoubleNode<>(value);
            if (head != null) {
                cur.last = tail;
                tail.next = cur;
                tail = cur;
            } else {
                head = cur;
                tail = cur;
            }
            size++;
        }

        //从头部弹出
        public V pollHead() {
            V ans = null;
            if (head == null) {
                return ans;
            }
            size--;
            ans = head.value;
            //如果头尾是同一个元素，弹出之后，删除元素，头尾置空
            if (head == tail) {
                head = null;
                tail = null;
            }else{
                head = head.next;
                head.last = null;
            }
            return ans;
        }
        //从尾部弹出
        public V pollTail() {
            V ans = null;
            if (tail == null) {
                return ans;
            }
            size--;
            ans = tail.value;
            //如果头尾是同一个元素，弹出之后，删除元素，头尾置空
            if (head == tail) {
                head = null;
                tail = null;
            }else{
                tail = tail.last;
                tail.next = null;
            }
            return ans;
        }
    }
}
