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

    HashMap<Integer, Long> map = new HashMap<>();

    public long kthLargestLevelSum(TreeNode root, int k) {

        helper(root, 0);

        ArrayList<Long> list = new ArrayList<>(map.values());

        if(list.size() < k) {
            return -1;
        }

        Collections.sort(list, Collections.reverseOrder());

        return list.get(k - 1);
    }

    public void helper(TreeNode root, int level) {

        if(root == null) {
            return;
        }

        map.put(level, map.getOrDefault(level, 0L) + root.val);

        helper(root.left, level + 1);
        helper(root.right, level + 1);
    }
}