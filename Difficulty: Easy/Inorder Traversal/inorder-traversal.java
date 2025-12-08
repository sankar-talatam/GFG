/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> arlist = new ArrayList<>();
        inOrd(root,arlist);
        return arlist;
        
    }
    
    public void inOrd(Node root, ArrayList<Integer> arlist){
        if(root == null){
            return;
        }
        inOrd(root.left , arlist);
        arlist.add(root.data);
        inOrd(root.right, arlist);
        
    }
}