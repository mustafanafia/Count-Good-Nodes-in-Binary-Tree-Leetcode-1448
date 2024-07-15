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
    public int goodNodes(TreeNode root) {

        return this.countTheGoodNodes(root, Integer.MIN_VALUE);
    }

    private int countTheGoodNodes(TreeNode root, int max_value){

        if(root == null) return 0;

        int res = root.val < max_value ? 0 : 1;
        max_value = Math.max(max_value, root.val);

        return res + countTheGoodNodes(root.left, max_value) + countTheGoodNodes(root.right, max_value);

    }
}