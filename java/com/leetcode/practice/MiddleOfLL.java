package com.leetcode.practice;

//https://leetcode.com/problems/middle-of-the-linked-list/

public class MiddleOfLL {
    //get the middle node of a linked list
    public static ListNode middleNode(ListNode head) {
        int count = 1;
        ListNode current = head;

        //traverse the linked list and keep a running count of the number of nodes we go through
        while(current.next != null){
            count++;
            current = current.next;
        }

        count = (count/2); //cut the count in half to get the number of iterations until we get to the middle node

        while(count != 0){ //iterate through the linked list
            head = head.next;
            count--;
        }
        return head;
    }
}
