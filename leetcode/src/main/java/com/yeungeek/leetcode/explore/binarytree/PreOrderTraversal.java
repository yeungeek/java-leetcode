package com.yeungeek.leetcode.explore.binarytree;

import java.util.LinkedList;
import java.util.List;

public class PreOrderTraversal {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode right = new TreeNode(2);
        TreeNode left2 = new TreeNode(3);
        node.right = right;
        right.left = left2;

        PreOrderTraversal traversal = new PreOrderTraversal();
        List<Integer> resultList = traversal.preOrderTraversal(node);
        for (Integer value : resultList) {
            System.out.print(value);
        }
    }

    public List<Integer> preOrderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();
        if (null == root) {
            return result;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            result.add(node.val);

            if (null != node.right) {
                stack.add(node.right);
            }

            if (null != node.left) {
                stack.add(node.left);
            }
        }

        return result;
    }
}
