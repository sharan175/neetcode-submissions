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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> l=new ArrayList<>();
        if(root==null) return l;
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> k=new ArrayList<>();
            int a=q.size();
            for(int i=0;i<a;i++){
               TreeNode b=q.poll();
               k.add(b.val);
               if(b.left!=null){
                q.offer(b.left);
               }
               if(b.right!=null){
                q.offer(b.right);
               }
            }
            l.add(k);
        }
        return l;
    }
}
