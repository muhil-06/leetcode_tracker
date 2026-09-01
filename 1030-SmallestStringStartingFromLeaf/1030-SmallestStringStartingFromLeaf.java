// Last updated: 01/09/2026, 11:54:01
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
    String ans=null;
    public String smallestFromLeaf(TreeNode root) {
        dfs(root,"");
        return ans;
    }
    void dfs(TreeNode root,String s){
        if(root==null)
        return;
        s=(char)('a'+root.val)+s;
        if(root.left==null&&root.right==null){
            if(ans==null||s.compareTo(ans)<0){
                ans=s;
            }
            return;
        }
        dfs(root.left,s);
        dfs(root.right,s);     
    }
}