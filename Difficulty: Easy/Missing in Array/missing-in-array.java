class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length;

        // Your Code Here
        int s=0,c=0;
        for(int i=1;i<=n+1;i++){
            s+=i;
        }
        for(int i = 0;i < arr.length ; i++)
        {
            c+=arr[i];
        }
        return s-c;
    }
}