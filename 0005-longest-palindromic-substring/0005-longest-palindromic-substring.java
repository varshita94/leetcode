class Solution {

    boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        int n = s.length();
        int left = 0, right = 1;
        int max = 0, len;
        String ans = s.substring(0, 1);
        for (left = 0; left < n; left++) {
            for (right = left + 1; right < n; right++) {
                if (isPalindrome(s, left, right)) {
                    len = right - left + 1;
                    if (len > max) {
                        max = len;
                        ans = s.substring(left, right + 1);
                    }

                }

            }

        }
        return ans;
    }

}