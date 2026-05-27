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
    public TreeNode helper(ArrayList<Integer> list, int si, int end) {
        if(si > end) {
            return null;
        }

        int mid = si + (end - si) / 2;

        TreeNode node = new TreeNode(list.get(mid));

        node.left = helper(list, si, mid - 1);
        node.right = helper(list, mid + 1, end);

        return node;
    }

    public void inorder(TreeNode root, ArrayList<Integer> list) {
        if(root == null) {
            return;
        }

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();

        inorder(root, list);

        return helper(list, 0, list.size() - 1);
    }
}