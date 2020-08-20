package com.yeungeek.leetcode.explore.binarytree;

import java.util.LinkedList;

public class PathSum {
    public static void main(String[] args) {
//        TreeNode node = new TreeNode(5);
//        TreeNode left1 = new TreeNode(4);
//        TreeNode left2 = new TreeNode(11);
//        TreeNode left3 = new TreeNode(7);
//        TreeNode left3_1 = new TreeNode(2);
//
//        TreeNode right1 = new TreeNode(8);
//        TreeNode right2_1 = new TreeNode(13);
//        TreeNode right2_2 = new TreeNode(4);
//        TreeNode right3 = new TreeNode(1);
//
//        node.left = left1;
//        node.right = right1;
//
//        left1.left = left2;
//        left2.left = left3;
//        left2.right = left3_1;
//
//        right1.left = right2_1;
//        right1.right = right2_2;
//        right2_2.right = right3;

        TreeNode node = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        node.left = left;

        PathSum sum = new PathSum();
        System.out.println(sum.hasPathSum(node, 1));
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (null == root) {
            return false;
        }

        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> value = new LinkedList<>();
        stack.add(root);
        value.add(root.val);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int result = value.pop();

            if (null == node.left && null == node.right) {
                if (result == sum) {
                    return true;
                }
                continue;
            }

            if (null != node.left) {
                stack.add(node.left);
                value.add(node.left.val + result);
            }

            if (null != node.right) {
                stack.add(node.right);
                value.add(node.right.val + result);
            }
        }

        return false;
    }
}
