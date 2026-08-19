class Solution {
    static int[] dp;

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        int start0 = robber(nums, 0, n - 1);
        Arrays.fill(dp, -1);
        int start1 = robber(nums, 1, n);
        return Math.max(start0, start1);
    }

    int robber(int[] nums, int start, int end) {
        if (start >= end) {
            return 0;
        }
        if (dp[start] != -1) {
            return dp[start];
        }
        return dp[start] = Math.max(nums[start] + robber(nums, start + 2, end), robber(nums, start + 1, end));
    }
}

// // Recursively
// class Solution {
//     public int rob(int[] nums) {
//         int n = nums.length;
//         if(n == 1) return nums[0];
//         int start0 = robber(nums, 0, n - 1);
//         int start1 = robber(nums, 1, n);
//         return Math.max(start0, start1);
//     }
//     int robber(int[] nums, int start, int end){
//         if(start >= end){
//             return 0;
//         }
//         return Math.max(nums[start] + robber(nums, start + 2, end), robber(nums, start + 1, end));
//     }
// }