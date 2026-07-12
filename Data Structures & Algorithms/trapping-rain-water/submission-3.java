class Solution {
    public int trap(int[] height) {
        // // Brute Force O(n^2)
        // int n = height.length;
        // // if( n <= 2) return 0;
        // int ans = 0;
        // for(int i = 1 ; i < n - 1; i++){
        //     int maxLeft = 0;
        //     int maxRight = 0;
        //     for(int j = i - 1 ; j >= 0 ; j--){
        //         maxLeft= Math.max(maxLeft, height[j]);
        //     }
        //     for(int j = i + 1 ; j < n ; j++){
        //         maxRight = Math.max(maxRight, height[j]);
        //     }
        //     ans += Math.max(0, Math.min(maxLeft, maxRight) - height[i]);
        // }
        // return ans;

        // ============================================

        // // as we can see that we have finding maxLeft and maxRight for
        // // every index thus to optmise we have to limit this process
        // // Time -> O(n) but Space -> O(n)

        // int n = height.length;
        // if( n <= 2) return 0;
        // int[] maxLeft = new int[n];
        // int[] maxRight = new int[n];

        // maxLeft[0] = 0;
        // for(int i = 1 ; i < n ; i++){
        //     maxLeft[i] = Math.max(maxLeft[i - 1], height[i - 1]);
        // }

        // maxRight[n - 1] = 0;
        // for(int i = n - 2 ; i >= 0 ; i--){
        //     maxRight[i] = Math.max(maxRight[i + 1], height[i + 1]);
        // }

        // int ans = 0;
        // for(int i = 1 ; i < n - 1 ; i++){
        //     ans += Math.max(0, Math.min(maxLeft[i], maxRight[i]) - height[i]);
        // }
        // return ans;

        // ============================================

        // Two pointers T.C. -> O(n) & S.C. -> O(1)
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int maxRight = 0;
        int maxLeft = 0;
        int ans = 0;

        while (left < right) {
            maxLeft = Math.max(maxLeft, height[left]);
            maxRight = Math.max(maxRight, height[right]);
            if (maxLeft <= maxRight) {
                ans += Math.max(0, maxLeft - height[left]);
                left++;
            } else {
                ans += Math.max(0, maxRight - height[right]);
                right--;
            }
        }
        return ans;
    }
}