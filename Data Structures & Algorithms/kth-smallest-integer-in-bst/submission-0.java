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
    public void traverse(TreeNode r,List<Integer>m,int k){
        if(r==null){
            return;
        }
    traverse(r.left,m,k);
    m.add(r.val);
    traverse(r.right,m,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        int count=1;
    
        List<Integer> m=new ArrayList<>();
        traverse(root,m,k);
        return m.get(k-1);
    }
}
