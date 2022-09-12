package com.leetcode.practice;
import java.util.Stack;
//https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {
    public static void main(String [] args){

    }
    //leverage a stack
    public boolean isValid(String s) {
        Stack <Character> parStack = new Stack<>();
        for(char e: s.toCharArray()){
            if(e == '(')
                parStack.push(')');
            else if(e == '[')
                parStack.push(']');
            else if(e == '{')
                parStack.push('}');
            else{
                if(parStack.empty() || parStack.pop() != e)
                    return false;
            }
        }
        return parStack.isEmpty();
    }
}
