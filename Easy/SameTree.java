package Easy;

public class SameTree {
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }

        if(p == null || q == null){
            return false;
        }
        // if((p.left == null && p.right == null)&&(q.left == null && q.right == null)){
        //     return true;
        // }
        String s1 = recur(p);
        String s2 = recur(q);
        System.gc();
        return s1.equals(s2);
    }

    public String recur(TreeNode s){
        if(s.left == null && s.right != null){
             return (s.val+"()"+"("+recur(s.right)+")");
        }else if(s.left != null && s.right == null){
            return (s.val+"("+recur(s.left)+")");
        }else if(s.left == null && s.right == null){
            return s.val+"";
        }
        return (s.val+"("+recur(s.left)+")"+"("+recur(s.right)+")");
    }
}
