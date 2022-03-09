class Solution {
    public int minDepth(TreeNode root) {
        return helper(0,root);

    }
    public int helper(int index,TreeNode root){
        if(root==null) return index;

        int left=helper(index+1,root.left);
        int right=helper(index+1,root.right);

        return Math.min(left,right);
    }
}