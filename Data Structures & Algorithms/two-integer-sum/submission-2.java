class Solution {
    public int[] twoSum(int[] nums, int target) {
        // optimised
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int dif = target - nums[i];
            if (map.containsKey(dif)) {
                return new int[] {  map.get(dif), i };
            }
            map.put(nums[i], i);
        }
        return new int[] { -1 };

        // // brute force - 0(n^2)
        // int n = nums.length;
        // int[] ans = new int[2];
        // for(int i = 0 ; i < n ; i++){
        //     for(int j = 0 ; j < n ; j++){
        //         if(i == j) continue;
        //         if(nums[i] + nums[j] == target){
        //             ans[0] = i;
        //             ans[1] = j;
        //             return ans;
        //         }
        //     }
        // }
        // return ans;
    }
}