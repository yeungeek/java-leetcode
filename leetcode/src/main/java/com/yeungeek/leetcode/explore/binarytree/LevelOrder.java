package com.yeungeek.leetcode.explore.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        TreeNode right = new TreeNode(20);
        TreeNode left = new TreeNode(9);
        TreeNode left1 = new TreeNode(15);
        TreeNode right1 = new TreeNode(17);

        node.left = left;
        node.right = right;

        right.left = left1;
        right.right = right1;

        LevelOrder levelOrder = new LevelOrder();
        List<List<Integer>> result = levelOrder.levelOrder(node);
        for (List<Integer> list : result) {
            System.out.println(list);
        }

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if (null == root) {
            return result;
        }

        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (null != node.left) {
                    queue.add(node.left);
                }

                if (null != node.right) {
                    queue.add(node.right);
                }
            }
            result.add(level);
        }
        return result;
    }
}
