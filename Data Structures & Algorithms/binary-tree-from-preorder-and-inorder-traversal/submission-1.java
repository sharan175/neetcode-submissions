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
    int idx=0;
    HashMap<Integer,Integer>m=new HashMap<>();
    public TreeNode build(int pre[],int in[],int s,int e){
      if(s>e){
        return null;
      }
      TreeNode l=new TreeNode(pre[idx]);
      int mid=m.get(pre[idx++]);
      l.left=build(pre,in,s,mid-1);
      l.right=build(pre,in,mid+1,e);
      return l;
    }
    public TreeNode buildTree(int[] pre, int[] in) {
     for(int i=0;i<in.length;i++){
        m.put(in[i],i);
     }
     return build(pre,in,0,in.length-1);
    }
}
