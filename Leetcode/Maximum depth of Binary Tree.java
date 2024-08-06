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
 
class Solution {
    private int depth=0;
    List<Integer> result = new ArrayList<>();
    public int maxDepth(TreeNode root) {
        if(root !=null){
          maxDepth(root.left);
          result.add(root.val);
          maxDepth(root.right);
        }
        depth++;
        return depth;
        
        
        
    }
}
*/
class Solution {
    private int maxDepth = 0;

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        dfs(root, 1);
        return maxDepth;
    }

    private void dfs(TreeNode node, int depth) {
        if (node == null) return;
        maxDepth = Math.max(maxDepth, depth);
        dfs(node.left, depth + 1);
        dfs(node.right, depth + 1);
    }
}
