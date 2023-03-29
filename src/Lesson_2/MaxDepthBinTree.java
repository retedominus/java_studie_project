package Lesson_2;

public class MaxDepthBinTree {
        public static int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }

            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return 1 + Math.max(left, right);
        }

}
