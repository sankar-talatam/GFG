/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    int minValue(Node root) {
        // code here
        int  n = Integer.MAX_VALUE;
        return val(root,n);
        
    }
    
    int val(Node root,int n){
        if(root == null) return n;
        
        
        n = val(root.left,n);
        n = Math.min(n,root.data);
        n = val(root.right,n);

        return n;
    }
}
