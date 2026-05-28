/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void helper(TreeNode root, int k, List<Integer> list) {
        if(root == null || k < 0) {
            return;
        }

        if(k == 0) {
            list.add(root.val);
            return;
        }

        helper(root.left, k - 1, list);
        helper(root.right, k - 1, list);
    }

    public int helper2(TreeNode root, TreeNode target, int k, List<Integer> list) {
        if(root == null) {
            return -1;
        }

        if(root.val == target.val) {
            helper(root, k, list);
            return 0;
        }

        int left = helper2(root.left, target, k, list);
        if(left != -1) {
            if(left + 1 == k) {
                list.add(root.val);
            } else {
                helper(root.right, k - left - 2, list);
            }

            return left + 1;
        }

        int right = helper2(root.right, target, k, list);
        if(right != -1) {
            if(right + 1 == k) {
                list.add(root.val);
            } else {
                helper(root.left, k - right - 2, list);
            }

            return right + 1;
        }

        return -1;
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> list = new ArrayList<>();

        helper2(root, target, k, list);
        return list;
    }
}