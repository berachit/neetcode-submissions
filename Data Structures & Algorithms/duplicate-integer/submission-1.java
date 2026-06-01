class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;

        // optimised version 
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;

        // // brute force -> gives TLE
        // for(int i = 0 ; i < n ; i++){
        //     for(int j = i + 1 ; j < n ; j++){
        //         if(nums[i] == nums[j]) return true;
        //     }
        // }
        // return false;
    }
}