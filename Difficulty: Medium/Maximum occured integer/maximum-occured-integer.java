class Solution {
    public int maxOccured(List<Integer> L, List<Integer> R) {
        int maxVal = 1000000;  
        int[] freq = new int[maxVal + 2];

        for (int i = 0; i < L.size(); i++) {
            freq[L.get(i)]++;
            freq[R.get(i) + 1]--;
        }

        int maxCount = freq[0];
        int result = 0;

        for (int i = 1; i < freq.length; i++) {
            freq[i] += freq[i - 1];

            if (freq[i] > maxCount) {
                maxCount = freq[i];
                result = i;
            }
        }

        return result;
    }
}