/*
class Node {
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    public int kthSmallest(Node root, int k) {
        // code here
        ArrayList<Integer> arlist = new ArrayList<>();
        
        inorder(root,arlist);
        if(arlist.size() < k) return -1;
        return arlist.get(k-1);
        
    }
    public static ArrayList<Integer> inorder(Node root,ArrayList<Integer> arlist){
        if(root == null) return arlist;
        
        inorder(root.left, arlist);
        arlist.add(root.data);
        inorder(root.right,arlist);
        
        return arlist;
    }
}