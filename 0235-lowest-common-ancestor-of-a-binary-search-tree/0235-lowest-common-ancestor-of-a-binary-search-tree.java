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
    public void helper(TreeNode root, TreeNode node, ArrayList<Integer> list) {
        if(root == null) {
            return;
        }

        if(root.val == node.val) {
            list.add(root.val);
            return;
        } else if(root.val > node.val) {
            list.add(root.val);
            helper(root.left, node, list);
        } else {
            list.add(root.val);
            helper(root.right, node, list);
        }
    }

    public TreeNode find(ArrayList<Integer> listp, ArrayList<Integer> listq) {
        TreeNode lca = null;

        int i = 0;
        for(; i < listp.size() && i < listq.size(); i++) {
            if(!listp.get(i).equals(listq.get(i))) {
            break;
        }
}

        lca = new TreeNode(listp.get(i - 1));
        return lca;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<Integer> listp = new ArrayList<>();
        ArrayList<Integer> listq = new ArrayList<>();

        helper(root, p, listp);
        helper(root, q, listq);

        return find(listp, listq);
    }
}