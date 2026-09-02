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
    public int dept(TreeNode r){
    if(r==null) return 0;
    int l=dept(r.left);
    int ri=dept(r.right);
    return Math.max(l,ri) +1;
    }
    public int maxDepth(TreeNode root) {
        return dept(root);
        
    }
}
