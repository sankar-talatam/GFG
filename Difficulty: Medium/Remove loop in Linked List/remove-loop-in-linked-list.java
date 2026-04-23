

/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        // code here
         HashSet<Node> a=new HashSet<>();
        Node temp=head;
        while(temp!=null){
            if(a.contains(temp.next)){
                temp.next=null;
            }
            a.add(temp);
            temp=temp.next;
        }
        return;
    }
}