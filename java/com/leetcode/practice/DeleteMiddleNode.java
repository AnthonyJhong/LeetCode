package com.leetcode.practice;
//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
public class DeleteMiddleNode {
    public static void main(String [] args){
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(4);
        printLL(deleteMiddle(head1));

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        printLL(deleteMiddle(head2));

        ListNode head3 = new ListNode(1);
        printLL(deleteMiddle(head3));




    }
    public static ListNode deleteMiddle(ListNode head){
        int count = 1;
        ListNode current = head;

        //traverse the linked list and keep a running count of the number of nodes we go through
        while(current.next != null){
            count++;
            current = current.next;
        }

        if(count == 1) // if count = 1 then we delete the only node in the list
            return null;
        else if(count == 2){ //if count = 2 then the node after head should be null
            head.next = null;
            return head;
        }


        count = (count/2) - 1; //cut the count in half to get the number of iterations until we get to the middle node
        current = head;
        while(count != 0){ //iterate through the linked list
            current = current.next;
            count--;
        }
        current.next = current.next.next;

        return head;
    }

    public static void printLL(ListNode current){
        while(current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
