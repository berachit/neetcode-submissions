class Solution {
    public int maxProfit(int[] prices) {
        // // brute force O(n^2)
        // int n = prices.length;
        // int ans = 0;
        // for(int i = 0 ; i < n ; i++){
        //     for(int j = i + 1 ; j < n ; j++){
        //         int dif = prices[j] - prices[i];
        //         ans = Math.max(ans,dif);
        //     }
        // }
        // return ans;

        // =========================================

        // Kadane Algo O(n)
        int n = prices.length;
        int[] temp = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            temp[i] = prices[i + 1] - prices[i];
        }

        int ans = 0;
        int sum = 0;

        for (int i = 0; i < n - 1; i++) {
            sum += temp[i];
            ans = Math.max(ans, sum);
            if (sum < 0)
                sum = 0;
        }
        return ans;
    }
}