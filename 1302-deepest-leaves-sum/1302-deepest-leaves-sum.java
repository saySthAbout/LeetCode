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
    int level=0;
    int sum=0;
    public int deepestLeavesSum(TreeNode root) {
        dfs(root, 0);
        return sum;
    }
    
    private void dfs(TreeNode root, int l){
        if(root!=null){
            if(l > level){
                level=l;
                sum = root.val;
            }else if(l == level){
                sum+=root.val;
            }
            dfs(root.left, l+1);
            dfs(root.right, l+1);
        }
    }
}