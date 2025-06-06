class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        // code 
        Arrays.sort(arr);
        int now=0;
        int prev=0;
        int temp=0;
        int count=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<arr[i+1] && arr[i]!=arr[i+1])
            {
                now=arr[i];
                temp=now;
            }
            prev=temp;
            if(arr[i]==arr[i+1])
                {
                    count++;
                    //System.out.println(count);
                }
        }
        
        if(count==arr.length-1)
        return -1;
        else
        return prev;
    }
}