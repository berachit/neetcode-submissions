class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Brute force O(n^2)
        // int n = s.length();
        // int ans = 0;
        // for (int i = 0; i < n; i++) {
        //     int l = 1;
        //     Set<Character> set = new HashSet<>();
        //     set.add(s.charAt(i));
        //     for (int j = i + 1; j < n; j++) {
        //         if (set.contains(s.charAt(j))) {
        //             break;
        //         } else {
        //             l++;
        //             set.add(s.charAt(j));
        //         }
        //     }
        //     ans = Math.max(ans, l);
        // }
        // return ans;

        // ============================================

        // // Better approach but Still O(n^2)
        // int n = s.length();
        // int left = 0;
        // int ans = 0;
        // Set<Character> set = new HashSet<>();
        // for (int right = 0; right < n; right++) {
        //     while (set.contains(s.charAt(right))) {
        //         set.remove(s.charAt(left));
        //         left++;
        //     }
        //     set.add(s.charAt(right));
        //     ans = Math.max(ans, right - left + 1);
        // }
        // return ans;

        // ============================================

        // Optimsed one O(n)
        int n = s.length();
        int left = 0;
        int ans = 0;
        Map<Character,Integer> map = new HashMap<>();

        for(int right = 0 ; right < n ; right++){
            char ch = s.charAt(right);
            if(map.containsKey(ch) && map.get(ch) >= left){
                left = map.get(ch) + 1;
            }
            map.put(ch , right);
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}