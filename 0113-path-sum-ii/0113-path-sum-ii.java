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
    List<List<Integer>> outer = new ArrayList<>();

    public void helper(TreeNode root, int targetSum, List<Integer> inner, int sum) {
        if(root == null) {
            return;
        }

        sum += root.val;
        inner.add(root.val);

        if(root.left == null && root.right == null) {
            if(sum == targetSum) {
                outer.add(new ArrayList<>(inner));
            }
        }

        helper(root.left, targetSum, inner, sum);
        helper(root.right, targetSum, inner, sum);

        inner.remove(inner.size() - 1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> inner= new ArrayList<>();

        helper(root, targetSum, inner, 0);

        return outer;
    }
}