package com.leetcode.practice;

import java.util.Stack;

//https://leetcode.com/problems/implement-queue-using-stacks/submissions/
class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    //pop each element in S1 and push it to S2 pop the top element of S2 and store it in a var and pop all elements of S2
    //back into S1 return the stored variable
    public int pop() {
        int numPopped = -99;
        if(!stack1.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }

            numPopped = stack2.pop();

            while(!stack2.empty()){
                stack1.push(stack2.pop());
            }
        }
        return numPopped;

    }
    // transfer all elements to one array store the top and transfer elements back to the original stack
    public int peek() {
        int numPeeked = -99;
        if(!stack1.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }

            numPeeked = stack2.peek();

            while(!stack2.empty()){
                stack1.push(stack2.pop());
            }
        }
        return numPeeked;
    }

    public boolean empty() {
        return stack1.empty();
    }
}

public class QueueUsingStacks {
    public static void main(String [] args){
        MyQueue newQueue = new MyQueue();
        newQueue.push(1);
        System.out.println(newQueue.pop());

        newQueue.push(1);
        newQueue.push(2);
        newQueue.push(3);
        newQueue.push(4);
        newQueue.push(5);
        newQueue.push(6);
        newQueue.push(7);
        newQueue.push(8);
        newQueue.push(9);
        newQueue.push(20);

        for(int i = 0; i < 10; i++){
            System.out.println(newQueue.peek());
            System.out.println(newQueue.pop());
        }

        System.out.println(newQueue.empty());

    }
}
