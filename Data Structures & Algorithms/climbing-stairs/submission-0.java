class Solution {
    static int[] dp;
    public int climbStairs(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return climb(n, 0);
    }
    int climb(int n, int stair){
        if(stair == n) return 1;
        if(stair > n) return 0;
        if(dp[stair] != -1) return dp[stair];
        return dp[stair] = climb(n, stair + 1) + climb(n, stair + 2);
    }
}
