class Solution {
    public int lengthOfLongestSubstring(String s) {
        //create a set
        Set<Character> subString = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for(int right=0;right<s.length();right++)
        {
            //remove element that already exists in the set

            while(subString.contains(s.charAt(right)))
            {
                subString.remove(s.charAt(left));
                left++; //shrink the window
            }

            //now add the element at the right
            subString.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}