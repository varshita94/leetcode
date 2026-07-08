class Solution {
    public long sumAndMultiply(int n) {
        //convert to string
        String s = Integer.toString(n);
        
        int sum = 0;

        String s2 = s.replace("0", "");
        int len = s2.length();
        if(len == 0) return 0;
        for(int i = 0; i<len;i++)
        {
            sum += s2.charAt(i) - '0';
        }
        long res = Long.parseLong(s2);
        
        res *= sum;
        return res;
        



        
    }
}