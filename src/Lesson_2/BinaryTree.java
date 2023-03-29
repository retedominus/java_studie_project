package Lesson_2;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        dfs(root, ans);
        return ans;
    }

    // depth first search
    // поиск вглубину
    private static void dfs(TreeNode root, List<Integer> ans) {
        if (root == null) return;
        ans.add(root.val);

        dfs(root.left, ans);
        dfs(root.right, ans);
    }

}
