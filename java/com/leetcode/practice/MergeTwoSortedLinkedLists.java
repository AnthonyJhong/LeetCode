package com.leetcode.practice;

//https://leetcode.com/problems/merge-two-sorted-lists/
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class MergeTwoSortedLinkedLists {
    public static void main(String [] args){

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(4);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);

        printLL(mergeTwoLists(head1, head2));
        printLL(mergeTwoLists(new ListNode(1), new ListNode(0)));
    }

    //iterative solution o(n) n being the length of the largest linked list
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode headOfNew = new ListNode(-9999);
        ListNode current = headOfNew;

        //go through both lists at the same time assessing which how to order until we reach the end of a list
        while(list1 != null && list2 !=null){
            if(list1.val <= list2.val){
                 current.next = list1;
                 list1 = list1.next;
                 current = current.next;
            }
            else if(list1.val > list2.val){
                current.next = list2;
                list2 = list2.next;
                current = current.next;
            }
        }
        //Becasue the while above breaks if either of the lists comes to an end if either list still has elements append
        //them to the end  of current
        if(list1 != null)
            current.next = list1;

        if(list2 != null)
            current.next = list2;

        return headOfNew.next;
    }

    public static void printLL(ListNode current){
        while(current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
