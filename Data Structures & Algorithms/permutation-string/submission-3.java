class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // Brute force will be like making all the combinations with s1
        // string then match it with the s2 string
        // But it will cost O(n!) for just making the combinations
        // So it will be a tle  

        // Better brute force will be use sorting method instead of an array

        // Optimised Approach -> t.c -> O(n)

        int n = s1.length();
        int m = s2.length();

        if (n > m)
            return false;

        int[] ch1 = new int[26];
        int[] ch2 = new int[26];

        for (int i = 0; i < n; i++) {
            ch1[s1.charAt(i) - 'a']++;
            ch2[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(ch1, ch2))
            return true;

        for(int i = n ; i < m ; i++) {
            ch2[s2.charAt(i) - 'a']++;
            ch2[s2.charAt(i - n) - 'a']--;
            if (Arrays.equals(ch1, ch2))
                return true;
        }

        return false;
    }
}