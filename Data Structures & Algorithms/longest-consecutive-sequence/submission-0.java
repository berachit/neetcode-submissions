class Solution {
    public int longestConsecutive(int[] nums) {
        // // brute force O(n^2)
        // int n = nums.length;
        // Set<Integer> set = new HashSet<>();
        // for(int num : nums){
        //     set.add(num);
        // }
        // int ans = 0;
        // for(int s : set){
        //     int len = 1;
        //     while(set.contains(s+1)){
        //         len++;
        //         s++;
        //     }
        //     ans = Math.max(len,ans);
        // }
        // return ans;

        // // better optmised O(nlogn)
        // int n = nums.length;
        // Arrays.sort(nums);
        // if(n == 0) return 0;
        // int ans = 1;
        // int len = 1;
        // for(int i = 1 ; i < n ; i++){
        //     if(nums[i - 1] == nums[i]){
        //         continue;
        //     }else if((nums[i - 1] + 1) == nums[i]){
        //         len++;
        //     }else{
        //         len = 1;
        //     }
        //     ans = Math.max(ans , len);
        // }
        // return ans;

        // optmised one O(n)
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int ans = 0;

        for (int s : set) {
            int len = 1;
            if (!set.contains(s - 1)) {
                while (set.contains(s + 1)) {
                    len++;
                    s++;
                }
            }
            ans = Math.max(ans, len);
        }
        return ans;
    }
}