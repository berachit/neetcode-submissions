class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // optmised
        int n = strs.length;
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int[] nums = new int[26];
            for (int j = 0; j < strs[i].length(); j++) {
                nums[strs[i].charAt(j) - 'a']++;
            }
            String str = Arrays.toString(nums);

            if (!map.containsKey(str)) {
                map.put(str, new ArrayList<>());
            }

            map.get(str).add(strs[i]);
        }

        for (Map.Entry<String, List<String>> ele : map.entrySet()) {
            ans.add(ele.getValue());
        }
        return ans;

        //     // brute force
        //     int n = strs.length;
        //     List<List<String>> ans = new ArrayList<>();
        //     Map<String,List<String>> map = new HashMap<>();
        //     for(int i = 0 ; i < n ; i++){
        //         String sort = sorted(strs[i]);
        //         if(map.containsKey(sort)){
        //             map.get(sort).add(strs[i]);
        //         } else{
        //             map.put(sort, new ArrayList<>());
        //             map.get(sort).add(strs[i]);
        //         }
        //     }
        //     for(Map.Entry<String, List<String>> ele : map.entrySet()){
        //         ans.add(ele.getValue());
        //     }
        //     return ans;
        // }
        // public String sorted(String s){
        //     char[] arr = s.toCharArray();
        //     Arrays.sort(arr);
        //     // StringBuilder st = new StringBuilder();
        //     // for(char a : arr){
        //     //     st.append(a);
        //     // }
        //     // to convert an char array to string we can use: new String(arr)
        //     return new String(arr);
    }
}