class Solution {
    public String minWindow(String s, String t) {
        // ** we will use hashmap as in the constraints the string can
        // consist of uppercase and lowercase alphabets, so thereby we 
        // cannot use array techique to store the frequency

        // Optmised one t.c. -> O(n+m) & s.c. -> O(n+m) 
        int n = s.length();
        int m = t.length();
        if (n < m)
            return "";

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }

        int lenRequired = m;
        int left = 0;
        int right = 0;
        int start = 0;
        int end = 0;
        int minLen = Integer.MAX_VALUE;

        while (right < n) {
            if (lenRequired > 0) {
                char ch = s.charAt(right);
                if (map.getOrDefault(ch, 0) > 0) {
                    lenRequired--;
                }
                map.put(ch, map.getOrDefault(ch, 0) - 1);
                right++;
            }
                while(lenRequired <= 0) {
                char ch = s.charAt(left);
                int len = right - left;
                if (len < minLen) {
                    minLen = len;
                    start = left;
                    end = right;
                }
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                if (map.get(ch) > 0) {
                    lenRequired++;
                }
                left++;
            }
        }
        return s.substring(start, end);
    }
}