class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[k];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        ArrayList<Integer>[] arr = new ArrayList[n + 1];
        for (Map.Entry<Integer, Integer> ele : map.entrySet()) {
            if (arr[ele.getValue()] == null) {
                arr[ele.getValue()] = new ArrayList<>();
            }
            arr[ele.getValue()].add(ele.getKey());
        }

        int x = 0;
        for (int i = n; i > 0; i--) {
            if (arr[i] == null)
                continue;
            for (int j = 0; j < arr[i].size(); j++) {
                ans[x++] = arr[i].get(j);
            }
            if (x == k)
                break;
        }
        return ans;
    }
}