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

    public void printPath(List<String> path, List<String> ans) {

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < path.size(); i++) {

            sb.append(path.get(i));

            if(i != path.size() - 1) {
                sb.append("->");
            }
        }

        ans.add(sb.toString());
    }

    public void printRootToLeaf(TreeNode root,
                                List<String> path,
                                List<String> ans) {

        if(root == null) {
            return;
        }

        path.add(String.valueOf(root.val));

        if(root.left == null && root.right == null) {
            printPath(path, ans);
        }

        printRootToLeaf(root.left, path, ans);
        printRootToLeaf(root.right, path, ans);

        path.remove(path.size() - 1);
    }

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();

        printRootToLeaf(root, path, ans);

        return ans;
    }
}