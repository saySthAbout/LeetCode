public class Solution {

  public TreeNode deleteNode(TreeNode root, int key) {
    if (root == null) { // (1)
      return root;
    }
    if (key < root.val) { // (2)
      root.left = deleteNode(root.left, key);
      return root;
    }
    if (key > root.val) { // (3)
      root.right = deleteNode(root.right, key);
      return root;
    }
    if (root.left == null) { // (4)
      return root.right;
    }
    if (root.right == null) { // (5)
      return root.left;
    }
    // (6)
    TreeNode node = findNode(root.right);
    node.left = root.left;
    return root.right;
  }

  private TreeNode findNode(TreeNode node) {
    while (node.left != null) {
      node = node.left;
    }
    return node;
  }
}