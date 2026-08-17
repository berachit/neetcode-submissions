class Solution {
    static int[] dp;

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        int start0 = climb(cost, 0);
        int start1 = climb(cost, 1);
        return Math.min(start0, start1);
    }

    int climb(int[] cost, int start){
        if(start >= cost.length) return 0;
        if(dp[start] != -1) return dp[start];
        int takeOne = cost[start] + climb(cost, start + 1);
        int takeTwo = cost[start] + climb(cost, start + 2);
        return dp[start] = Math.min(takeOne, takeTwo);
    }
}

// // Recursively
// class Solution {
//     static int ans;

//     public int minCostClimbingStairs(int[] cost) {
//         int n = cost.length;
//         ans = 0;
//         int start0 = climb(cost, 0);
//         int start1 = climb(cost, 1);
//         return Math.min(start0, start1);
//     }

//     int climb(int[] cost, int start){
//         if(start >= cost.length) return 0;
//         int takeOne = cost[start] + climb(cost, start + 1);
//         int takeTwo = cost[start] + climb(cost, start + 2);
//         ans = Math.min(takeOne, takeTwo);
//         return ans;
//     }
// }