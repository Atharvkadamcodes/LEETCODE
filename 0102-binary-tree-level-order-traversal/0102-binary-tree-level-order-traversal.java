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
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> outer = new ArrayList<>();

        if (root == null) return outer;

        Queue<TreeNode> myQueue = new LinkedList<>();
        myQueue.add(root);
        myQueue.add(null);

        List<Integer> inner = new ArrayList<>();

        while(!myQueue.isEmpty()) {
            TreeNode currNode = myQueue.remove();
            if(currNode == null) {
                outer.add(new ArrayList<>(inner));
                inner.clear();

                if(myQueue.isEmpty()) {
                    break;
                } else {
                    myQueue.add(null);
                }
            } else {
                inner.add(currNode.val);
                if(currNode.left != null) {
                    myQueue.add(currNode.left);
                }
                if(currNode.right != null) {
                    myQueue.add(currNode.right);
                }
            }
        }

        return outer;
    }
}