package com.yeungeek.leetcode.explore.binarytree;

public class TreeMaxDepth {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        TreeNode right1 = new TreeNode(20);
        TreeNode left1 = new TreeNode(9);
        TreeNode left2 = new TreeNode(15);
        TreeNode right2 = new TreeNode(17);

        node.left = left1;
        node.right = right1;
        right1.left = left2;
        right1.right = right2;

        TreeMaxDepth depth = new TreeMaxDepth();
        System.out.println(depth.maxDepth(node));
    }

    public int maxDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }

    private int treeDepth(TreeNode root, int result, int depth) {
        if (null == root) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            result = Math.max(result, depth);
            return result;
        }

        return Math.max(treeDepth(root.left, result, depth + 1),
                treeDepth(root.right, result, depth + 1));
    }
}
