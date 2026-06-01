class Solution {
    public boolean isAnagram(String s, String t) {
        int s1 = s.length();
        int t1 = t.length();

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(int i = 0 ; i < s1 ; i++){
            arr1[s.charAt(i) - 'a']++;
        }

        for(int i = 0 ; i < t1 ; i++){
            arr2[t.charAt(i) - 'a']++;
        }

        for(int i = 0 ; i < 26 ; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
