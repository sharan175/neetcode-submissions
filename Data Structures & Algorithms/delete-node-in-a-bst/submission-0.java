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
    public TreeNode f(TreeNode x){
         while(x.left!=null){
            x=x.left;
         }
         return x;
    }
    public TreeNode d(TreeNode r,int k){
      if(r==null){
        return null;
      }
      if(r.val==k){
         if(r.left==null && r.right==null){
             return null;
         }
         if(r.left==null){
            return r.right;
         }
         if(r.right==null){
            return r.left;
         }
         else{
            TreeNode x=f(r.right);
            r.val=x.val;
            r.right=d(r.right,x.val);
         }
      }
      TreeNode l=d(r.left,k);
      TreeNode ri=d(r.right,k);
      r.left=l;
      r.right=ri;
      return r;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
       return d(root,key); 
    }
}