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

        if(root == null) {
            return outer;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        ArrayList<Integer> inner = new ArrayList<>();
        boolean leftToRight = true;

        while(!q.isEmpty()) {
            TreeNode curr = q.poll();

            if(curr == null) {
                if(q.isEmpty()) {
                    break;
                }
                if(!leftToRight) {
                    Collections.reverse(inner);
                }
                
                outer.add(new ArrayList<>(inner));
                inner.clear();

                leftToRight = !leftToRight;
                q.add(null);
            } else {
                inner.add(curr.val);

                if(curr.left != null) {
                    q.add(curr.left);
                }

                if(curr.right != null) {
                    q.add(curr.right);
                }
            }
        }

        if(!inner.isEmpty()) {
            if(!leftToRight) {
                Collections.reverse(inner);
            }

            outer.add(new ArrayList<>(inner));
        }

        return outer;
    }
}