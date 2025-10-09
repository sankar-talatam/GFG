/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> arList = new ArrayList<>();
        
         postO(root,arList);
         return arList;
    }
    private static void postO(Node root,ArrayList<Integer> arList){
        if(root == null){
            return;
        }
        postO(root.left, arList);
        postO(root.right,arList);
        arList.add(root.data);
    }
}