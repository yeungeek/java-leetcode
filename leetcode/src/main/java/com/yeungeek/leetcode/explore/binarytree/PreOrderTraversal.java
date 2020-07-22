package com.yeungeek.leetcode.explore.binarytree;

import java.util.ArrayList;
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
//        List<Integer> resultList = traversal.preOrderTraversal(node);
        List<Integer> resultList = traversal.recursionPreOrder(node);
        for (Integer value : resultList) {
            System.out.print(value);
        }
    }

    public List<Integer> recursionPreOrder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        recursionNode(root, list);
        return list;
    }

    private void recursionNode(TreeNode node, List<Integer> list) {
        if (null != node) {
            list.add(node.val);

            if (null != node.left) {
                recursionNode(node.left, list);
            }

            if (null != node.right) {
                recursionNode(node.right, list);
            }
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
