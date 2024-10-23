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
    public TreeNode replaceValueInTree(TreeNode root) {
        if (root == null) return null;
        
        // Start with root level
        root.val = 0;
        
        // Handle all other levels using queues
        Queue<TreeNode> currentLevel = new LinkedList<>();
        currentLevel.offer(root);
        
        while (!currentLevel.isEmpty()) {
            Queue<TreeNode> nextLevel = new LinkedList<>();
            // Record child nodes and their parent sums
            Map<TreeNode, Integer> parentSum = new HashMap<>();
            int totalSum = 0;
            
            // Process current level and collect next level info
            for (TreeNode node : currentLevel) {
                int childSum = 0;
                
                // Add left child if exists
                if (node.left != null) {
                    nextLevel.offer(node.left);
                    childSum += node.left.val;
                }
                
                // Add right child if exists
                if (node.right != null) {
                    nextLevel.offer(node.right);
                    childSum += node.right.val;
                }
                
                // Record sum of children for this parent
                parentSum.put(node, childSum);
                totalSum += childSum;
            }
            
            // Update values for next level
            for (TreeNode node : currentLevel) {
                int siblingSum = parentSum.get(node);
                // Update left child
                if (node.left != null) {
                    node.left.val = totalSum - siblingSum;
                }
                // Update right child
                if (node.right != null) {
                    node.right.val = totalSum - siblingSum;
                }
            }
            
            currentLevel = nextLevel;
        }
        
        return root;
    }
}