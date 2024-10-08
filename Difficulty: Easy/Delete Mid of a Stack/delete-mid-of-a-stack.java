//{ Driver Code Starts
// Initial template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int sizeOfStack = sc.nextInt();
            Stack<Integer> myStack = new Stack<>();

            // adding elements to the stack
            for (int i = 0; i < sizeOfStack; i++) {
                int x = sc.nextInt();
                myStack.push(x);
            }
            Solution obj = new Solution();
            obj.deleteMid(myStack, sizeOfStack);

            while (!myStack.isEmpty()) {
                System.out.print(myStack.peek() + " ");
                myStack.pop();
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public void deleteMid(Stack<Integer> s, int n) {
        int m = (int)((n + 1) / 2);
        
        Stack<Integer> stack1 = new Stack<>();
        
        for (int i = 1; i <= n; i++) {
            if(n%2==0){
               if (i == m+1) {
                s.pop();
                break;
            } else {
                stack1.push(s.pop());
            }
        }
        else{
            if (i == m) {
                s.pop();
                break;
            } else {
                stack1.push(s.pop());
            }
        }
            }
            
        
        while (!stack1.isEmpty()) {
            s.push(stack1.pop());
        }
    }
}

