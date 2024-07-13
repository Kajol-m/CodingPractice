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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> tree=new ArrayList<>();
        List<Integer> level = new ArrayList<>();
        level.add(root.val);
        tree.add(level);
        q.add(root);
        
        while(!q.isEmpty()){
            level = new ArrayList<>();
            int size = q.size();
            for(int j=0;j<size;j++){
                TreeNode curr=q.poll();
                if (curr.left!= null) {
                    level.add(curr.left.val);
                    q.add(curr.left);
                }
                if (curr.right!= null) {
                    level.add(curr.right.val);
                    q.add(curr.right);
                }
            }
            if (!level.isEmpty()) tree.add(level);
        }
        return tree;
    }
}
