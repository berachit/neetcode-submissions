class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // // Brute Force O(n^3) Used SET to prevent duplicate triplates
        // Arrays.sort(nums);
        // int n = nums.length;
        // Set<List<Integer>> temp = new HashSet<>();
        // List<Integer> list = new ArrayList<>();
        // for (int i = 0; i < n - 2; i++) {
        //     for (int j = i + 1; j < n - 1; j++) {
        //         for (int k = j + 1; k < n; k++) {
        //             if (nums[i] + nums[j] + nums[k] == 0) {
        //                 list.add(nums[i]);
        //                 list.add(nums[j]);
        //                 list.add(nums[k]);
        //                 temp.add(list);
        //                 list = new ArrayList<>();
        //             }
        //         }
        //     }
        // }
        // List<List<Integer>> ans = new ArrayList<>();
        // for (List<Integer> tem : temp) {
        //     ans.add(tem);
        // }
        // return ans;

        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> temp = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int target = 0 - nums[i];
            int left = i + 1;
            int right = n - 1;
            while(left < right){
                int sum = nums[left] + nums[right];
                if(sum == target){
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    temp.add(list);
                    list = new ArrayList<>();
                    left++;
                    right--;
                }else if(sum > target){
                    right--;
                }else{
                    left++;
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (List<Integer> tem : temp) {
            ans.add(tem);
        }
        return ans;
    }
}