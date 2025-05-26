/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node sortedInsert(Node head, int data) {
        // code here
        Node newNode = new Node(data);
        Node temp = head;
        if(head.data > data){
            while(temp.next!= head){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
            head = newNode;
            return head;
        }
        if(head == null){
            head.next = newNode;
            return head;
        }
        while(temp.next != head){
            if(temp.data<= data && temp.next.data >= data){
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            else{
                temp = temp.next;
            }
        }
        if(temp.next == head){
            temp.next = newNode;
            newNode.next = head;
        }
        return head;
    }
}