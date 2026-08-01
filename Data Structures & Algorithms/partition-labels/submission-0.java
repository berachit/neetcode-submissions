class Solution {
    public List<Integer> partitionLabels(String s) {
        // t.c. -> O(n^m)
        // int n = s.length();
        // List<Integer> ans = new ArrayList<>();
        // Map<Character, Integer> map = new HashMap();
        // for (int i = 0; i < n; i++) {
        //     map.put(s.charAt(i), i);
        // }
        // int start = 0;
        // int end = 0;
        // for (int i = 0; i < n; i++) {
        //     end = map.get(s.charAt(i));
        //     while (i < end) {
        //         end = Math.max(end, map.get(s.charAt(i)));
        //         i++;
        //     }
        //     ans.add(end - start + 1);
        //     start = i + 1;
        // }
        // return ans;

        // =======================================

        // // Optimised t.c. -> O(n) but s.c. -> O(n)
        // int n = s.length();
        // List<Integer> ans = new ArrayList<>();
        // Map<Character, Integer> map = new HashMap();
        // for (int i = 0; i < n; i++) {
        //     map.put(s.charAt(i), i);
        // }
        // int start = 0;
        // int end = 0;
        // for (int i = 0; i < n; i++) {
        //     end = Math.max(end, map.get(s.charAt(i)));
        //     if (i == end) {
        //         ans.add(end - start + 1);
        //         start = i + 1;
        //     }
        // }
        // return ans;

        // =======================================

        // Optimised t.c. -> O(n) & s.c. -> O(1) 
        int n = s.length();
        List<Integer> ans = new ArrayList<>();
        int[] map = new int[26];
        for (int i = 0; i < n; i++) {
            map[s.charAt(i) - 'a'] = i;
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < n; i++) {
            end = Math.max(end, map[s.charAt(i) - 'a']);
            if (i == end) {
                ans.add(end - start + 1);
                start = i + 1;
            }
        }
        return ans;
    }
}