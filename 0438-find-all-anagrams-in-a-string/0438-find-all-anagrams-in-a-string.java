class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        //using freq_count and sliding window
        List<Integer> result = new ArrayList<>();
        int[] p_count = new int[26]; // worst case p has 26 char
         int[] s_count = new int[26];
        //window size
        int k = p.length(); 
        //calculate frreq of p


        if (s.length() < p.length()) return result;
        for(char c : p.toCharArray())
        {
            p_count[c - 'a']++; //zero-based index
        }


        for(int i = 0;i<s.length();i++)
        {
            //sliding window

            //add curr char to window

            s_count[s.charAt(i) - 'a']++;


            //remove element form window
            if(i>=k)
            {
                s_count[s.charAt(i-k) - 'a']--;
            }


            if(Arrays.equals(p_count,s_count))
            {
                result.add(i-k+1);
            }
        }
        return result;

           }
}