/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        HashMap<Node,Integer> map = new HashMap<>();
        Node temp = head;
        int len = 1;
        while(!map.containsKey(temp) && temp!=null){
            map.put(temp,len);
            temp = temp.next;
            len++;
        }
        if(temp == null) return 0;
        int val = len - map.get(temp);
        return val;
    }
}