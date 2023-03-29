package Lesson_2;

import java.util.*;

public class ArrayToTreeNode {

    public static void main(String[] args) {
        Integer[] tree = {1, 2, 3, null, 4};

        TreeNode root = getRootOf(tree);
        bfs(root);
    }

    static void bfs(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        List<List<Integer>> ans = new ArrayList<>();

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < q.size(); i++) {
                TreeNode cur = q.poll();
                level.add(cur.val);
                if (cur.left != null) {
                    q.add(cur.left);
                }
                if (cur.right != null) {
                    q.add(cur.right);
                }
            }
            ans.add(level);
        }

        for (var level : ans) {
            System.out.println(level);
        }
    }


    // parent - ind
    // leftChild - ind * 2 + 1
    // rightChild - ind * 2 + 2
    public static TreeNode getRootOf(Integer[] tree) {
        int ind = 0;
        TreeNode root = new TreeNode(tree[ind]);
        helper(root, tree, 0);

        return root;
    }

    private static void helper(TreeNode root, Integer[] tree, int index) {
        if (root == null) return;
        int left = index * 2 + 1;
        int right = index * 2 + 2;

        if (left < tree.length && tree[left] != null) {
            TreeNode leftChild = new TreeNode(tree[left]);
            root.left = leftChild;
            helper(leftChild, tree, left);
        }

        if (right < tree.length && tree[right] != null) {
            TreeNode rightChild = new TreeNode(tree[right]);
            root.right = rightChild;
            helper(rightChild, tree, right);
        }

    }


}
//
//    class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//
//        TreeNode(int val) {
//            this.val = val;
//        }
//
//        TreeNode() {
//
//        }
//    }

//}
