package Easy;
import java.util.*;
public class BinaryTreeInorderTraversal {
    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        pio(root, nums);
        return nums;
    }
    public void pio(TreeNode node, List<Integer> n){
        if (node == null)
            return;

        pio(node.left, n);
        n.add(node.val);
        pio(node.right, n);
    }
}
