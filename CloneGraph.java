/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null) return null;
        HashMap<Node,Node> map=new HashMap<Node,Node>();
        Queue<Node> queue=new LinkedList<Node>();
        map.put(node,new Node(node.val,new ArrayList<Node>()));
        queue.add(node);
        while(!queue.isEmpty()){
            Node h=queue.poll();
            for(Node neighbour:h.neighbors){
                if(!map.containsKey(neighbour)){
                    map.put(neighbour,new Node(neighbour.val,new ArrayList<Node>()));
                    queue.add(neighbour);
                }
                map.get(h).neighbors.add(map.get(neighbour));
            }
        }


        return map.get(node);
    }
}