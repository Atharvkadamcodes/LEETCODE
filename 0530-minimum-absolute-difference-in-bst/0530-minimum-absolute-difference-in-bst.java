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
    ArrayList<Integer> list = new ArrayList<>();

    public void inorder(TreeNode root) {
        if(root == null) {
            return;
        }

        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        inorder(root);

        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < list.size() - 1; i++) {
            int min = list.get(i + 1) - list.get(i);
            if(ans > min) {
                ans = min;
            }
        }

        return ans;
    }
}