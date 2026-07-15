class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // // brute force t.c. -> O(n^2)
        // int n = gas.length;
        // for(int i = 0 ; i < n ; i++){
        //     if(gas[i] >= cost[i]){
        //         int extra = gas[i] - cost[i];
        //         for(int j = (i + 1) % n; ; j = (j + 1) % n){
        //             int total = gas[j] + extra;
        //             if(total < cost[j]) break;
        //             if(j == i) return i;
        //             extra = total - cost[j];
        //         }
        //     }
        // }
        // return -1;

        // ============================================

        // optimised 
        int n = gas.length;
        int ans = 0;

        int totalGas = 0;
        int totalCost = 0;
        for(int i = 0 ; i < n ; i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }

        if(totalGas < totalCost){
            return -1;
        }else{
            int total = 0;
            for(int i = 0 ; i < n ; i++){
                total += gas[i] - cost[i];
                if(total < 0){
                    total = 0;
                    ans = i + 1;
                }
            }
        }

        return ans;
    }
}