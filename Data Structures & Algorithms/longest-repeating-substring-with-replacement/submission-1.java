class Solution {
    public int characterReplacement(String s, int k) {
        // // Brute Force -> O(n^2)
        // int n = s.length();
        // int ans = 0;
        // for(int i = 0 ; i < n ; i++){
        //     int[] map = new int[26];
        //     for(int j = i ; j < n ; j++){
        //         map[s.charAt(j) - 'A']++;
        //         int maxFreq = 0;
        //         for(int m : map){
        //             maxFreq = Math.max(maxFreq, m);
        //         }
        //         int len = j - i + 1;
        //         if((len - maxFreq) <= k){
        //             ans = Math.max(ans, len);
        //         }
        //     }
        // }
        // return ans;


        // ============================================
        
        // Optimise Approach O(n)
        int n = s.length();
        int left = 0;
        int ans = 0;
        int[] nums = new int[26];

        for(int right = 0 ; right < n ; right++){
            nums[s.charAt(right) - 'A']++;
            int maxFreq = 0;
            for(int nu : nums){
                maxFreq = Math.max(maxFreq, nu);
            }
            int len = right - left + 1;
            if(len - maxFreq <= k){
                ans = Math.max(ans, len);
            }else{
                nums[s.charAt(left) - 'A']--;
                left++;
            }
        }
        return ans;
    }
}   