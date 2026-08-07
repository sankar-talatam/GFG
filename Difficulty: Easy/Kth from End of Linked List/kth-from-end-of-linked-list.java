/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int n) {
        // Your code here
        int c=0;
    	Node temp=head;
    	while(head!=null)
    	{
    	    
    	    head=head.next;
    	    c++;
    	    
    	    
    	}
    	if(c<n)
    	{
    	    return -1;
    	}
    	head=temp;
    	for(int i=0;i<c-n;i++)
    	{
    	    
    	    head=head.next;
    	}
    	return head.data;
    }
}