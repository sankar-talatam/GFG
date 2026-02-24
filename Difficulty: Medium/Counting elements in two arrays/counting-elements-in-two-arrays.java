class Solution {
    public static ArrayList<Integer> countLessEq(int a[], int b[]) {
        Arrays.sort(b);
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < a.length; i++) {
            int left = 0;
            int right = b.length - 1;
            int ans = -1;
            
            while (left <= right) {
                int mid = left + (right - left) / 2;
                
                if (b[mid] <= a[i]) {
                    ans = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            
            result.add(ans + 1);
        }
        
        return result;
    }
}