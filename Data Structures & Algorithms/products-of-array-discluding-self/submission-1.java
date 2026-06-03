class Solution {
    public int[] productExceptSelf(int[] nums) {
        // more optimised 
        int n = nums.length;
        int[] ans = new int[n];
        int product = 1;

        for(int i = 0 ; i < n ; i++){
            ans[i] = product;
            product *= nums[i];
        }
        product = 1;
        for(int i = n - 1 ; i >= 0 ; i--){
            ans[i] *= product;
            product *= nums[i];
        }

        return ans;

        // // using prefix and suffix array
        // int n = nums.length;
        // int[] pre = new int[n];
        // int product = 1;

        // for(int i = 0 ; i < n ; i++){
        //     pre[i] = product;
        //     product *= nums[i];
        // }
        // int[] suf = new int[n];
        // product = 1;
        // for(int i = n - 1 ; i >= 0 ; i--){
        //     suf[i] = product;
        //     product *= nums[i];
        // }

        // for(int i = 0 ; i < n ; i++){
        //     nums[i] = suf[i] * pre[i];
        // }

        // return nums;

        // // using division operator
        // int n = nums.length;
        // int product = 1;
        // boolean isZero = false;
        // int noOfZero = 0;
        // for(int i = 0 ; i < n ; i++){
        //     if(nums[i] == 0){
        //         isZero = true;
        //         noOfZero++;
        //         continue;
        //     }
        //     product *= nums[i];
        // }
        // for(int i = 0 ; i < n ; i++){
        //     if(isZero && nums[i] != 0){
        //         nums[i] = 0;
        //     } else if(isZero && nums[i] == 0){
        //         if(noOfZero > 1){
        //             nums[i] = 0;
        //             continue;
        //         }
        //         nums[i] = product;
        //     }else{
        //         nums[i] = product / nums[i];
        //     }
        // }
        // return nums;
    }
}