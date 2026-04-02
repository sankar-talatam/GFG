/*
// Representation of a node
class Node {
    int data;
    Node next;
    Node (int d) {
       data = d;
       next = null;
    }
};
*/
class Solution {
    public Node arrayToList(int arr[]) {
        // code here
        Node newNode = new Node(0);
        Node dumm = newNode;
        for(int i : arr){
            newNode.next = new Node(i);
            newNode = newNode.next;
        }
        return dumm.next;
        
    }
}
