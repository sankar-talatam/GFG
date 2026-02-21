class Solution {
    public int hIndex(int[] citations) {
        // code here
        Arrays.sort(citations);
        int n = citations.length;
        int count = 0;
        for(int i = 0; i < citations.length; i++){
            int val = n - i - 1;
            if(citations[val] >= (i + 1)){
                count++;
            }
            else{
                return count;
            }
        }
        return count;
    }
}