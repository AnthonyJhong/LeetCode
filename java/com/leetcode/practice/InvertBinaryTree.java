package com.leetcode.practice;

//https://leetcode.com/problems/invert-binary-tree/
public class InvertBinaryTree {
    public static void main(String[] args){
        //testing in in leetcode as it prints the tree for free
    }
    //This can be done recursively going through each node and ensuring that left is switch to right
    public static TreeNode invertTree(TreeNode root){
        if(root == null) //if tree is empty nothing to swap
            return null;
        swap(root); //start swapping nodes
        return root;
    }

    public static void swap(TreeNode current){
        TreeNode temp;
        //short circuit order matters
        //If either left or right node have a value we need to swap
        if((current.left != null || current.right != null) && current != null) {
            temp = current.right;
            current.right = current.left; //set the current nodes right to current nodes left
            current.left = temp; //set the current nodes left to the current nodes right
            swap(current.left); //recursive call for left node
            swap(current.right); //recursive call for right node
        }
    }
}
