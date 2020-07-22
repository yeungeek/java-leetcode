package com.yeungeek.leetcode.explore.binarytree;

import java.util.LinkedList;
import java.util.List;

public class PostOrderTraversal {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(5);
        TreeNode right = new TreeNode(4);
        TreeNode left = new TreeNode(3);
        TreeNode left1 = new TreeNode(1);
        TreeNode right1 = new TreeNode(2);

        node.left = left;
        node.right = right;

        left.left = left1;
        left.right = right1;

        PostOrderTraversal traversal = new PostOrderTraversal();
        List<Integer> resultList = traversal.postOrderTraversal(node);
        for (Integer value : resultList) {
            System.out.print(value);
        }
    }

    public List<Integer> postOrderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();
        if (null == root) {
            return result;
        }

        stack.add(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            result.addFirst(node.val);

            if (null != node.left) {
                stack.add(node.left);
            }

            if (null != node.right) {
                stack.add(node.right);
            }
        }

        return result;
    }
}
