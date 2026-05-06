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
    public int maxLevelSum(TreeNode root) {

        if (root == null) return 0;

        Queue<TreeNode> myQueue = new LinkedList<>();
        myQueue.add(root);
        myQueue.add(null);

        int currSum = Integer.MIN_VALUE;

        int value = 0;

        int level = 1;
        int ans = 1;

        while(!myQueue.isEmpty()) {
            TreeNode currNode = myQueue.remove();
            if(currNode == null) {
                if(currSum < value) {
                    currSum = value;
                    ans = level;
                }

                value = 0;

                level++;

                if(myQueue.isEmpty()) {
                    break;
                } else {
                    myQueue.add(null);
                }
            } else {
                value += currNode.val;
                if(currNode.left != null) {
                    myQueue.add(currNode.left);
                }
                if(currNode.right != null) {
                    myQueue.add(currNode.right);
                }
            }
        }

        return ans;
    }
}