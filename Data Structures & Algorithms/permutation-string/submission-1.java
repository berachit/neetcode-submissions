class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // Brute force will be like making all the combinations with s1
        // string then match it with the s2 string
        // But it will cost O(n!) for just making the combinations
        // So it will be a tle  

        int n = s1.length();
        int m = s2.length();

        if(n > m) return false;

        int[] ch1 = new int[26];

        for (int i = 0; i < n; i++) {
            ch1[s1.charAt(i) - 'a']++;
        }

        int[] ch2 = new int[26];

        int left = 0;
        int right = 0;

        for (; right < n; right++) {
            ch2[s2.charAt(right) - 'a']++;
        }
        String st1 = Arrays.toString(ch1);
        String st2 = Arrays.toString(ch2);


        if (st1.equals(st2))
            return true;
            
        while (right < m) {
            ch2[s2.charAt(right) - 'a']++;
            ch2[s2.charAt(left) - 'a']--;
            left++;
            right++;
            st2 = Arrays.toString(ch2);
            if (st1.equals(st2))
                return true;
        }

        return false;
    }
}