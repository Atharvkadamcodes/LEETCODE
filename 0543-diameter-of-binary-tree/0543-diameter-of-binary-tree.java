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
    class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public int diameterOfBinaryTree(TreeNode root) {
        Info ans = helper(root);

        return ans.diam;
    }

    public Info helper(TreeNode root) {
        if(root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = helper(root.left);
        Info rightInfo = helper(root.right);

        int height = 1 + Math.max(leftInfo.ht, rightInfo.ht);

        int diameterThroughRoot = leftInfo.ht + rightInfo.ht;

        int diameter = Math.max(
            diameterThroughRoot,
            Math.max(leftInfo.diam, rightInfo.diam)
        );
        
        return new Info(diameter, height);
    }
}