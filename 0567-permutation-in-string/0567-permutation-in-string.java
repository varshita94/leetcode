class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        // using frquency metric and fixed sliding window

        int s1_count[] = new int[26];
        int s2_count[] = new int[26];

        //calculate freq of s1
        for(char c: s1.toCharArray())
        {
            s1_count[c - 'a']++; //zero - index based
        }
        //window size
        int k = s1.length();

        int i= 0;

        while(i < s2.length())
        {
            //add element to window
            s2_count[s2.charAt(i) - 'a']++;

            //remove element from the window
            if(i>=k){
                s2_count[s2.charAt(i-k) - 'a']--;
            }
            

            if(Arrays.equals(s1_count,s2_count))
            {
                return true;
            }
            else
            {
                i++;
            }

        }

        return false;
    }
}