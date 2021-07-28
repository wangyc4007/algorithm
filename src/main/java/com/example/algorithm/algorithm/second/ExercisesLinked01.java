package com.example.algorithm.algorithm.second;

import org.assertj.core.util.Lists;

/**
 * @author Y~chao
 * @create 2021/7/28 17:14
 *题目：K个节点的组内你想调整
 * 给定一个单链表的头结点head，和一个正数k
 * 实现k个节点的小组内部逆序，如果最后一组不够k个就不调整
 * 例子：
 * 调整前：1->2->3->4->5->6->7->8    k = 3
 * 调整后：3->2->1->6->5->4->7->8
 *
 * 换头函数
 *
 */
public class ExercisesLinked01 {

    public static class ListNode{
        private int val;
        private ListNode next;
    }
    //方法指的是，从start开始，往后数k个节点，把第k个节点数据返回即可
    public static ListNode getKGroupEnd(ListNode start, int k){
        while(--k != 0 && start != null){
            start = start.next;
        }
        return start;
    }
    //在指定区间内进行反转
    //反转前: ....1->2->3->4->5->6    k = 4
    //反转后: null->4->3->2->1->5->6
    public static void reverse(ListNode start, ListNode end){
        end = end.next;
        ListNode pre = null;
        ListNode cur = start;
        ListNode next;
        while(cur != end){
            //反转功能，区间内反转，从start到end进行反转
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        start.next = end;
    }

}
