class Solution {
    public int getMinDiff(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        int res=arr[n-1]-arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i] - k < 0) {
                continue;
            }
            int max_hei=Math.max(arr[i-1]+k,arr[n-1]-k);
            int min_hei=Math.min(arr[0]+k,arr[i]-k);
            int def=max_hei-min_hei;
             res=Math.min(def,res);
        }
        return res;
    }
}
