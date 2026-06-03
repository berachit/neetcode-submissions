class Solution {
    public int[] productExceptSelf(int[] nums) {
        // using division operator
        int n = nums.length;
        int product = 1;
        boolean isZero = false;
        int noOfZero = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 0){
                isZero = true;
                noOfZero++;
                continue;
            }
            product *= nums[i];
        }
        for(int i = 0 ; i < n ; i++){
            if(isZero && nums[i] != 0){
                nums[i] = 0;
            } else if(isZero && nums[i] == 0){
                if(noOfZero > 1){
                    nums[i] = 0;
                    continue;
                }
                nums[i] = product;
            }else{
                nums[i] = product / nums[i];
            }
        }
        return nums;
    }
}