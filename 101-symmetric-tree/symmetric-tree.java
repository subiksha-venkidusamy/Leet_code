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
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        return isSym(root.left,root.right);
    }
    private boolean isSym(TreeNode p,TreeNode q){
        if(p==null && q==null)return true;
        if(p==null || q==null || p.val!=q.val)return false;

        return isSym(p.left,q.right)&& isSym(p.right,q.left);
    }
}