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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> outer = new ArrayList<>();
        ArrayList<Integer> inner = new ArrayList<>();

        if (root == null) {
            return outer;
        }

        int isRtoL = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            if (curr == null) {
                if (q.isEmpty()) {
                    if (isRtoL % 2 != 0) {
                        Collections.reverse(inner);
                    }
                    outer.add(new ArrayList<>(inner));
                    break;
                }

                if (isRtoL % 2 != 0) {
                    Collections.reverse(inner);
                }

                outer.add(new ArrayList<>(inner));
                inner.clear();
                isRtoL++;

                q.add(null);

            } else {
                inner.add(curr.val);

                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }

        return outer;
    }
}