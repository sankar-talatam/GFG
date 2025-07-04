/* class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}*/
class Solution {
    static Node segregate(Node head) {
        // code here
        Node temp = head;
        ArrayList<Integer> ar = new ArrayList<>();
        while(temp != null){
            ar.add(temp.data);
            temp = temp.next;
        }
        temp = head;
        Collections.sort(ar);
        for(int i : ar){
            temp.data = i;
            temp = temp.next;
        }
        return head;
    }
}