class Solution {
    public void flatten(TreeNode root) {
        if(root==null) return;
        Stack<TreeNode> stack=new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode curr_node=stack.pop();
            if(curr_node.right!=null){
                stack.add(curr_node.right);
            }
            if(curr_node.left!=null){
                stack.add(curr_node.left);
            }
            if(!stack.isEmpty()){
                curr_node.right=stack.peek();
            }
            curr_node.left=null;
        }

    }
}