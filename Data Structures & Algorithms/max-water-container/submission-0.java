class Solution {
    public int maxArea(int[] height) {
        // // Brute Force -> O(n^2)
        // int n = height.length;
        // int ans = 0;
        // for(int i = 0 ; i < n - 1 ; i++){
        //     for(int j = i + 1 ; j < n ; j++){
        //         int min = Math.min(height[i],height[j]);
        //         int area = min * (j - i);
        //         ans = Math.max(area, ans); 
        //     }
        // }
        // return ans;

        
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int ans = 0;
        while(left < right){
            int min = Math.min(height[right],height[left]);
            int area = min * (right - left);
            ans = Math.max(area, ans);
            if(height[left] <= height[right]) left++;
            else right--;
            // else {
            //     left++;
            //     right--;
            // }
        }
        return ans;
    }
}