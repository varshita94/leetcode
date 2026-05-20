class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        Character t;
        int left = 0, right = n-1;

        while(left<right)
        {
          t = s[left];
          s[left] = s[right];
          s[right] = t;

          left++;
          right--;  
        }
    }
}