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
    public TreeNode invert(TreeNode r){
        if(r==null) return null;
        TreeNode l=invert(r.left);
        TreeNode ri=invert(r.right);
        r.left=ri;
        r.right=l;
        return r;
           }
    public TreeNode invertTree(TreeNode root) {
        return invert(root);
    }
}
