package Medium;

public class ConstructStringfromBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public String tree2str(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root.val + "";
        }
        return recur(root);
    }

    public String recur(TreeNode tn) {
        if (tn.left == null && tn.right != null) {
            return (tn.val + "()" + "(" + recur(tn.right) + ")");
        } else if (tn.left != null && tn.right == null) {
            return (tn.val + "(" + recur(tn.left) + ")");
        } else if (tn.left == null && tn.right == null) {
            return tn.val + "";
        }
        return (tn.val + "(" + recur(tn.left) + ")" + "(" + recur(tn.right) + ")");
    }
}
