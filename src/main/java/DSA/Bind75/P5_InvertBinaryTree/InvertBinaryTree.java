package DSA.Bind75.P5_InvertBinaryTree;

public class InvertBinaryTree {


    public TreeNode invertTree(TreeNode root) {

        revert(root);

        return root;

    }


    public void revert(TreeNode root) {
        if (root == null) return;
        TreeNode temp = new TreeNode();
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        revert(root.left);
        revert(root.right);

    }
}
