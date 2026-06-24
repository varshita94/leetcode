class Solution {
    public boolean isPalindrome(String s) {
        //remove special characters, numbers and spaces
        String clean_str  =  s.replaceAll("[^a-zA-Z0-9]","");
        if(clean_str.equals("")) return true;

        //convert upper to lower case
        String str = clean_str.toLowerCase();
        int n = str.length();
        for(int i = 0; i < n/2;i++)
        {
            if(str.charAt(i) != str.charAt(n - i- 1)) return false;
        }

        return true;
    }
}