/* Linklist node structure
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        if(head!=null && 1 == x){
            return head.next;
        }
        Node temp = head;
        Node prev = null;
        int c = 0;
        while(temp != null){
            c++;
            if(c == x){
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp= temp.next;
        }
        return head;
    }
}