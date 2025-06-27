class Solution {
    // Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root) {
        // write code here
        ArrayList<Integer> result = new ArrayList<>();
        preOrder(root,result);
        return result;
    }
    public static void preOrder(Node root,ArrayList<Integer> result){
        if(root == null) return;
        
        result.add(root.data);
        preOrder(root.left,result);
        preOrder(root.right, result);
    }
}