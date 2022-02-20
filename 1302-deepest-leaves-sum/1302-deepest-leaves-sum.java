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
    public int deepestLeavesSum(TreeNode root) {
        int total_sum = 0;

        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()){
            total_sum = 0;
            for(int i= que.size()-1;i>=0;i--){
                TreeNode node = que.poll();
                total_sum += node.val;

                if(node.left!=null) que.add(node.left);
                if(node.right!=null) que.add(node.right);
            }
        }
        return total_sum;   
    }
   
}