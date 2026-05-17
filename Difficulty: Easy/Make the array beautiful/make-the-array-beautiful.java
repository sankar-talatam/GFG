class Solution {
    List<Integer> makeBeautiful(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int num : arr) {
            int n = list.size();

            if (n > 0 &&
               ((list.get(n - 1) >= 0 && num < 0) ||
                (list.get(n - 1) < 0 && num >= 0))) {

                list.remove(n - 1);
            } else {
                list.add(num);
            }
        }

        return list;
    }
}