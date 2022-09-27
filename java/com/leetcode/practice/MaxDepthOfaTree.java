package com.leetcode.practice;
//https://leetcode.com/problems/maximum-depth-of-binary-tree/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class MaxDepthOfaTree {
    public static void main(String[] args){
        TreeNode root1 = new TreeNode();
        root1.left = new TreeNode();
        root1.right = new TreeNode();
        root1.left.left = new TreeNode();
        root1.left.right = null;
        root1.right.left = new TreeNode();
        root1.right.left.left = new TreeNode();
        System.out.println(maxDepth(root1));

        TreeNode root2 = new TreeNode();
        System.out.println(maxDepth(root2));

    }
    //best way to solve this is probably with recursion
    public static int maxDepth(TreeNode root){
        if(root == null)
            return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

    }
}
