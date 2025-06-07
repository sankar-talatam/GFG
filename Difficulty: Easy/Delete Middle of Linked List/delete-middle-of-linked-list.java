/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        int c = 0;
        Node temp = head;
        while(temp!=null){
            c++;
            temp = temp.next;
        }
        if(c == 1) return null;
        temp = head;
        int mid = Math.round((float)(c+1)/2);
        c = 0;
        while(temp!=null){
            c++;
            if(c == mid-1){
                Node newNode = temp.next.next;
                temp.next = newNode;
            }
            temp = temp.next;
        }
        return head;
    }
}