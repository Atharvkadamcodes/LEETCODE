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
import java.util.*;

import java.util.*;

class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {

        if (root == null) {
            return 0;
        }

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        int level = 0;
        long sum = 0;

        ArrayList<Long> kStore = new ArrayList<>();

        while (!q.isEmpty()) {

            TreeNode currNode = q.remove();

            if (currNode == null) {

                kStore.add(sum);

                sum = 0;

                if (!q.isEmpty()) {
                    q.add(null);
                }

            } else {

                sum += currNode.val;

                if (currNode.left != null) {
                    q.add(currNode.left);
                }

                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }

        Collections.sort(kStore);

        if(kStore.size() < k) return -1;

        long ans = kStore.get(kStore.size() - k);

        return ans;
    }
}