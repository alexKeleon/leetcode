package com.leetcode.easy;

/**
 * Maximum Depth of Binary Tree
 *
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path
 * from the root node down to the farthest leaf node.
 *
 *
 * result Submission Result: Accepted
 * Runtime: 1 ms

 * @author yichao.wu
 * @version $Id:  16/3/31 19:24.
 */
public class MaximumDepthOFBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 0;
        }
        int leftTreeDepth = maxDepth(root.left);
        int rightTreeDepth = maxDepth(root.right);
        return leftTreeDepth > rightTreeDepth ? leftTreeDepth + 1 : rightTreeDepth + 1;
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String args[]) {

    }

}
