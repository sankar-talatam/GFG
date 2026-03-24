/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public int GetNth(Node head, int index) {
        // Code here
        int count = 1;
        while(head!=null){
            if(index == count){
                return head.data;
            }
            count++;
            head = head.next;
        }
        return -1;
    }
}