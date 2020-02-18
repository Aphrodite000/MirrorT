public class Solution {
    public void Mirror(TreeNode root) {
        //等于空就说明已经变换完成了，啥也不需要干
        if(root!=null){
            TreeNode node=root.left;
            root.left=root.right;
            root.right=node;
            if(root.left!=null){
                Mirror(root.left);
            }
            if(root.right!=null){
                Mirror(root.right);
            }
        }
    }
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
}
