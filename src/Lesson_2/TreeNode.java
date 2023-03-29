package Lesson_2;
//    Definition for a binary tree node.
public class TreeNode {

    int val;
    Lesson_2.TreeNode left;
    Lesson_2.TreeNode right;
    TreeNode() {}
    TreeNode(int val) {this.val = val; }

    TreeNode(int val, Lesson_2.TreeNode left, Lesson_2.TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

