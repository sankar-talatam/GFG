//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class GfG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int n = str.length;
            Node head = new Node(Integer.parseInt(str[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(str[i]));
                tail = tail.next;
            }
            Solution obj = new Solution();
            head = obj.addOne(head);
            printList(head);
        }
    }
}
// } Driver Code Ends




/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    
    Node reverse(Node h) {
        Node prev = null;
        Node cur = h;
        Node temp;
        
        while (cur != null) {
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        
        return prev;
    }
    
    public Node addOne(Node head) {
        head = reverse(head);
        
        Node temp = head;
        int carry = 1;
        
        while (temp != null) {
            int sum = temp.data + carry;
            temp.data = sum % 10;
            carry = sum / 10;
            
            if (carry == 0) {
                break;
            }
            
            if (temp.next == null && carry > 0) {
                temp.next = new Node(carry);
                carry = 0;
            }
            
            temp = temp.next;
        }
        
        head = reverse(head);
        
        return head;
    }
}





