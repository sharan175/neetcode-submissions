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
    int index=0;
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    for(int i=0;i<inorder.length;i++){
        map.put(inorder[i],i);
    }
    return tree(preorder,0,inorder.length-1);
    }
    public TreeNode tree(int preorder[],int left,int right){
        if (left> right) return null;
       int val=preorder[index++];
       TreeNode root=new TreeNode(val);
       int a=map.get(val);
       root.left=tree(preorder,left,a-1);
       root.right=tree(preorder,a+1,right);
       return root;
    }
}
