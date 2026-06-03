class Solution {
    public boolean isPalindrome(String s) {
        s = s.trim().toLowerCase();
        if (s.isEmpty())
            return true;

        int n = s.length();

        int i = 0;
        int j = n - 1;
        while (i <= j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}