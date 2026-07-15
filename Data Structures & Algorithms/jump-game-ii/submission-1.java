class Solution {
    public int jump(int[] nums) {
        // Brute force will be checking all the combinations T.C.->O(n^n)

        // Better approach will be DP .... later on

        // Optimal Approach O(n)
        // so we will find the number of ranges so that we reach n - 1
        // for more see the notes
        
        // Why (right < n - 1)?***
        // 'right' represents the farthest index reachable with the 
        // current number of jumps. We keep expanding the range until it
        //  reaches the last index (n - 1). Once right >= n - 1, we've 
        // already reached (or can reach) the destination, so another 
        // iteration would only add an unnecessary extra jump.

        int n = nums.length;
        int jumps = 0;
        int left = 0;
        int right = 0;
        while (right < n - 1) {
            int farthest = 0;
            // this helps us to find what is the farthest place we can
            // reach with one more jump
            for (int i = left; i <= right; i++) {
                farthest = Math.max(nums[i] + i, farthest);
            }
            left = right + 1;
            right = farthest;
            jumps++;
        }
        return jumps;
    }
}