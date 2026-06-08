/* Structure of linked list node
class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/
class Solution {
    Node compute(Node head) {
        if (head == null || head.next == null)
            return head;

        head.next = compute(head.next);

        if (head.next != null && head.data < head.next.data)
            return head.next;

        return head;
    }
}