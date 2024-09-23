//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[]) {
        // code here
        int s1=0;
        int[] brr=new int[2];
        HashMap<Integer,Integer> newHp=new HashMap<>();
            for(int num : arr){
                if(newHp.containsKey(num)){
                    newHp.put(num,newHp.get(num)+1);
                }
                else{
                    newHp.put(num,1);
                }
                s1+=num;
        }
        int s3=0;
        for (int key : newHp.keySet()) {
    if (newHp.get(key) == 2) {
        s3=key;
    }
}
        int n=arr.length;
        int s2=0;
        for(int i = 1; i <= n ; i++){
            s2+=i;
        }
        int newS=s2-s1+s3;
        brr[0]=s3;
        brr[1]=newS;
        return brr;
    }
}