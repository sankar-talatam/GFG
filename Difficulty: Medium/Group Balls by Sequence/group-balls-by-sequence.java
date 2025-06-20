class Solution {
    public boolean validgroup(int[] arr, int k) {
        int n = arr.length;
        if (n % k != 0) {
            return false;
        }

        Map<Integer, Integer> freq = new TreeMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int num : new ArrayList<>(freq.keySet())) {
            while (freq.get(num) > 0) {
                for (int i = 0; i < k; i++) {
                    int current = num + i;
                    if (freq.getOrDefault(current, 0) == 0) {
                        return false;
                    }
                    freq.put(current, freq.get(current) - 1);
                }
            }
        }

        return true;
    }
}