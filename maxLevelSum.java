/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(root);
        int maxVal=0;
        int level=0;
        int l=0;
        while(!queue.isEmpty()){
            l=l+1;;
            int currVal=0;
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                currVal+=node.val;
                if(currVal>maxVal){
                    maxVal=currVal;
                    level=l;
                }
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
        }
        return level;

    }
}