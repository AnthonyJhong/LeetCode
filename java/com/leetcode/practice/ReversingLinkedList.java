package com.leetcode.practice;

public class ReversingLinkedList {
    public static void main(String [] args){
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(4);

        printLL(reverseList(head1));

        ListNode head2 = new ListNode(1);
        printLL(reverseList(head2));

    }
    //We can do this in O(n) one pass through the linked list
    //keep track of the node we want to bring to the front,
    //the node that is currently at the front
    //the node that is the next to be processed to the front
    public static ListNode reverseList(ListNode head) {

        if(head.next == null || head == null)
            return head;

        ListNode currentSwitch = head.next;
        ListNode nextSwitch;
        ListNode currentStart = head;

        while(currentSwitch != null){
            nextSwitch = currentSwitch.next;
            currentSwitch.next = currentStart;
            currentStart = currentSwitch;
            currentSwitch = nextSwitch;
        }
        head.next = null; //since the start is now the end we need to make it point to null
        return currentStart;
    }

    public static void printLL(ListNode current){
        while(current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

}