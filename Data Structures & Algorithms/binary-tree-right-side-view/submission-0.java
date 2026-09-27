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
    public List<Integer> rightSideView(TreeNode root) {
     Queue<TreeNode> q=new LinkedList<>();
     q.add(root);
     q.add(null);
     List<Integer> l=new ArrayList<>();
     while(!q.isEmpty() && q.peek()!=null){
        TreeNode a=q.poll();
        if(a.left!=null){
            q.offer(a.left);
        }
        if(a.right!=null){
            q.offer(a.right);
        }
        if(q.peek()==null){
            q.poll();
            q.offer(null);
            l.add(a.val);
        }
     } 
     return l; 
    }
}
