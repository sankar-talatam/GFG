/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution {
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root, int k) {
        // Your code here
        ArrayList<Integer> arList = new ArrayList<>();
        ArrayList<Integer> newlist = inorder(root,arList);
        Collections.sort(newlist);
        
        return newlist.get(newlist.size() -k);
        
        
    }
    ArrayList<Integer> inorder(Node root, ArrayList<Integer> list){
        if(root == null)return list;
        
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
        
        return list;
    }
}