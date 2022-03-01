class Solution {
    public int maxDepth(TreeNode root) {
        return helper(root,0);

    }
    public int helper(TreeNode root,int index){
        if(root==null)return index;
        int left=helper(root.left,index+1);
        int right=helper(root.right,index+1);

        return Math.max(left,right);

    }
}