class Solution {
    public boolean isSymmetric(TreeNode root) {

        return helper(root.left,root.right);

    }
    public boolean helper(TreeNode t1,TreeNode t2){
        if(t1==null && t2==null)return true;

        if(t1==null || t2==null)return false;
        if(t1.val!=t2.val){
            return false;
        }
        boolean side1=helper(t1.left,t2.right);
        boolean side2=helper(t1.right,t2.left);
        if(side1==true && side2==true){
            return true;
        }
        return false;
    }
}