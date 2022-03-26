/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null) return root;
        Queue<Node> queue=new LinkedList<Node>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            Node prev=null;
            while(size-->0){
                Node head=queue.poll();
                head.next=prev;
                prev=head;
                if(head.right!=null){
                    queue.offer(head.right);
                }
                if(head.left!=null){
                    queue.offer(head.left);
                }
            }
        }
        return root;

    }
}