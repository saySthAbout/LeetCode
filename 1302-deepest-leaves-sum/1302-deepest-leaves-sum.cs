/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public int DeepestLeavesSum(TreeNode root) {
        Queue<TreeNode> queue = new Queue<TreeNode>();
        queue.Enqueue(root);
        
        int result = 0;
        while (queue.Count > 0) {
            result = 0;
            int queueSize = queue.Count;
            
            for (int i = 0; i < queueSize; ++i) {
                TreeNode node = queue.Dequeue();
                
                result += node.val;
                
                if (node.left != null) {
                    queue.Enqueue(node.left);
                }
                
                if (node.right != null) {
                    queue.Enqueue(node.right);
                }
            }
        }
        
        return result;
    }
}