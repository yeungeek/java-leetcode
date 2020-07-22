package com.yeungeek.leetcode.explore.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InOrderTraversal {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode right = new TreeNode(2);
        TreeNode left2 = new TreeNode(3);
        node.right = right;
        right.left = left2;

        InOrderTraversal traversal = new InOrderTraversal();
        List<Integer> resultList = traversal.inorderTraversal(node);
//        List<Integer> resultList = traversal.recursionInOrder(node);
        for (Integer value : resultList) {
            System.out.print(value);
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();
        TreeNode curr = root;
        while (null != curr || !stack.isEmpty()) {
            while (null != curr) {
                //left
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            result.add(curr.val);
            curr = curr.right;
        }

        return result;
    }


    public List<Integer> recursionInOrder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        recursionNode(root, list);
        return list;
    }

    private void recursionNode(TreeNode node, List<Integer> list) {
        if (null != node) {
            if (null != node.left) {
                recursionNode(node.left, list);
            }
            list.add(node.val);

            if (null != node.right) {
                recursionNode(node.right, list);
            }
        }
    }
}
