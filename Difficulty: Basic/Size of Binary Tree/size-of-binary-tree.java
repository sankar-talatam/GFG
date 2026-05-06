/*
Definition for Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    public int inorder(Node root, int count){
        if(root == null){
            return count;
        }
        
        count = inorder(root.left, count);
        count++;
        count = inorder(root.right, count);
        
        return count;
    }
    public int getSize(Node root) {
        // code here
        
        int count = inorder(root,0);
        return count;
    }
}