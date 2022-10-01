package com.leetcode.practice;

import java.util.HashSet;

//https://leetcode.com/problems/linked-list-cycle/
public class CycleInLL {
    public static void main(String [] args){
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(4);
        head1.next.next.next = new ListNode(5);
        System.out.println(hasCycle(head1));

        ListNode head2 = new ListNode(2);
        System.out.println(hasCycle(head2));

        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);
        head3.next.next = new ListNode(4);
        head3.next.next.next = new ListNode(5);
        head3.next.next.next.next = head3;
        System.out.println(hasCycle(head3));

    }
    //can be done in o(1) this method will do it in O(N) by using a hashset
    public static boolean hasCycle(ListNode head) {
        if(head == null )
            return false;

        HashSet<ListNode> nodeSet = new HashSet<>();
        while(head.next != null) {
            if (!nodeSet.add(head)) //if the node exists in the set then return true as the same node is being added twice
                return true;
            else
                head = head.next;
        }
        return false;
    }

    //Floid's Turtoise and Hare Algorithm
    public static boolean hasCycleFaster(ListNode head){
        ListNode tortoise = head, hare = head;

        while(tortoise.next != null && hare.next.next != null){
            tortoise = tortoise.next;
            hare = hare.next.next;

            if(tortoise == hare)
                return true;
        }
        return false;
    }
}
