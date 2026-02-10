// User function Template for Java

class Solution {
    public int maxInstance(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int b = map.getOrDefault('b', 0);
        int a = map.getOrDefault('a', 0);
        int n = map.getOrDefault('n', 0);
        int l = map.getOrDefault('l', 0) / 2;
        int o = map.getOrDefault('o', 0) / 2;

        return Math.min(
            Math.min(b, a),
            Math.min(n, Math.min(l, o))
        );
    }
}
