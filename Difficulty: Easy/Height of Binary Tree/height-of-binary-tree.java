/*
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int height(Node node) {
        // code here
        if(node == null) return -1;
        
        int lh = height(node.left);
        
        int rh = height(node.right);
        
        int max = 1+Math.max(lh,rh);
        return max;
    }
}