class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int len = inorder.length;
        return helper(inorder,postorder,0,len-1,0,len-1);

    }
    public TreeNode helper(int[] inorder,int[] postorder,int inStart,int inEnd,int postStart,int postEnd){
        if(inStart>inEnd)return null;

        int rootVal=postorder[postEnd];
        TreeNode root=new TreeNode(rootVal);
        int rootIndex=inStart;
        for(;rootIndex<=inEnd;rootIndex++){
            if(inorder[rootIndex]==rootVal){
                break;
            }
        }
        int leftSize=rootIndex-inStart;
        int rightSize=inEnd-rootIndex;

        root.left=helper(inorder,postorder,inStart,rootIndex-1,postStart,(postStart+leftSize)-1);

        root.right=helper(inorder,postorder,rootIndex+1,inEnd,postEnd-rightSize,postEnd-1);

        return root;

    }
}