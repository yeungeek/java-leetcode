package com.yeungeek.leetcode.explore.binarytree;

public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);
        TreeNode left1 = new TreeNode(3);
        TreeNode right1 = new TreeNode(4);
        TreeNode left2 = new TreeNode(4);
        TreeNode right2 = new TreeNode(3);

        node.left = left;
        node.right = right;

        node.left.left = left1;
        node.left.right = right1;

        node.right.left = left2;
        node.right.right = right2;

        System.out.println(new SymmetricTree().isSymmetric(node));
    }

    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    private boolean check(TreeNode l, TreeNode r) {
        if (null == l && r == null) {
            return true;
        }

        if (null == l || r == null) {
            return false;
        }

        if (l.val != r.val) {
            return false;
        }

        return check(l.left, r.right) && check(l.right, r.left);
    }
}
