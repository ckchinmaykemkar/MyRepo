class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int level=0;
        List<List<Integer>> finalres=new ArrayList<List<Integer>>();
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){

            int size=queue.size();
            List<Integer> res=new ArrayList<Integer>();
            for(int i=0;i<size;i++){
                TreeNode node=queue.peek();
                if(level%2==0){
                    res.add(node.val);
                }else{
                    res.add(0,node.val);
                }
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }

            }
            level++;
            finalres.add(res);
        }
        return finalres;

    }
}