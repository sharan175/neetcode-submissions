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
    int s=Integer.MIN_VALUE;
    public int sum(TreeNode r){
        if(r==null){
            return 0;
        }
        int l=Math.max(0,sum(r.left));
        int ri=Math.max(0,sum(r.right));
        int path=r.val +l +ri;
        s=Math.max(s,path);
        return r.val + Math.max(l,ri);
    }
    public int maxPathSum(TreeNode root) {
        sum(root);
        return s;
    }
}
