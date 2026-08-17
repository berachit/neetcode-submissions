class Solution {
    static int[] dp;

    public int rob(int[] nums) {
        int n = nums.length;
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return robber(nums, 0);
    }

    int robber(int[] nums, int idx) {
        if (idx >= nums.length)
            return 0;
        if (dp[idx] != -1)
            return dp[idx];
        return dp[idx] = Math.max(nums[idx] + robber(nums, idx + 2), robber(nums, idx + 1));
    }
}

// // Recursively
// class Solution {
//     static int ans;

//     public int rob(int[] nums) {
//         int n = nums.length;
//         ans = 0;
//         return robber(nums, 0);
//     }

//     int robber(int[] nums, int idx){
//         if(idx >= nums.length) return 0;
//         return Math.max(nums[idx] + robber(nums , idx + 2), robber(nums, idx + 1));
//     }
// }