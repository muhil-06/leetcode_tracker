// Last updated: 11/08/2026, 12:15:28
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    String ans=null;
18    public String smallestFromLeaf(TreeNode root) {
19        dfs(root,"");
20        return ans;
21    }
22    void dfs(TreeNode root,String s){
23        if(root==null)
24        return;
25        s=(char)('a'+root.val)+s;
26        if(root.left==null&&root.right==null){
27            if(ans==null||s.compareTo(ans)<0){
28                ans=s;
29            }
30            return;
31        }
32        dfs(root.left,s);
33        dfs(root.right,s);     
34    }
35}