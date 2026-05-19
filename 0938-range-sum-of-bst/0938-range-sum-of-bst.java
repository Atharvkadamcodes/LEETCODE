/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sum = 0;

    public void sumBST(TreeNode root, int low, int high) {
        if(root == null) {
            return;
        }

        if(root.val >= low && root.val <= high) {
            sumBST(root.left, low, high);
            sum += root.val;
            sumBST(root.right, low, high);
        } else if(root.val < low) {
            sumBST(root.right, low, high);
        } else {
            sumBST(root.left, low, high);
        }
    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        sumBST(root, low, high);

        return sum;
    }
}