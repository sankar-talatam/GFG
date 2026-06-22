class Solution {
    public int maxArea(List<Integer> height) {
        int left = 0;
        int right = height.size() - 1;
        int maxArea = 0;

        while (left < right) {
            int barsBetween = right - left - 1;
            int area = Math.min(height.get(left), height.get(right)) * barsBetween;

            maxArea = Math.max(maxArea, area);

            if (height.get(left) < height.get(right)) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}