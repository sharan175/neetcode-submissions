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
    public void put(TreeNode x,int val){
       if(x.left==null && val<x.val){
        TreeNode l=new TreeNode(val);
        x.left=l;
        return;
       }
       if(x.right==null && val>x.val){
         TreeNode l=new TreeNode(val);
         x.right=l;
         return;
       }
       if(val<x.val){
         put(x.left,val);
         return;
       }
       else {
        put(x.right,val);
        return;
       }
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode x=root;
        if(root==null){
            return new TreeNode(val);
        }
        put(x,val);
        return root;
    }
}