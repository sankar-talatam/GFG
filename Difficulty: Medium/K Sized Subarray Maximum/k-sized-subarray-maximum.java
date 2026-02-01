


class Solution {
    public ArrayList<Integer> maxOfSubarrays(int arr[], int k) {
        // code here
        // if(k == 1) return arr;
         ArrayList<Integer> result = new ArrayList<>();
        
        if (arr.length < k) { 
            result.add(Collections.max(Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new))));
            return result;
        }
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            max = Math.max(max, arr[i]);
        }
        result.add(max);

        for (int i = k; i < arr.length; i++) {
            if (arr[i - k] == max) { 
                max = Integer.MIN_VALUE;
                for (int j = i - k + 1; j <= i; j++) {
                    max = Math.max(max, arr[j]);
                }
            } else { 
                max = Math.max(max, arr[i]);
            }
            result.add(max);
        }
        
        return result;
        
    }
}