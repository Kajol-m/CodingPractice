class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val!= q.val) return false;

        Queue<TreeNode> tree1 = new LinkedList<>();
        Queue<TreeNode> tree2 = new LinkedList<>();

        tree1.add(p);
        tree2.add(q);

        while (!tree1.isEmpty()) {
            TreeNode curr1 = tree1.remove();
            TreeNode curr2 = tree2.remove();

            if (curr1.val!= curr2.val) return false;

            if (curr1.left!= null) tree1.add(curr1.left);
            if (curr2.left!= null) tree2.add(curr2.left);
            if (curr1.right!= null) tree1.add(curr1.right);
            if (curr2.right!= null) tree2.add(curr2.right);

            if ((curr1.left == null)!= (curr2.left == null)) return false;
            if ((curr1.right == null)!= (curr2.right == null)) return false;
        }

        return true;
    }
}
