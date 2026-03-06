class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        if(n == 1) return s.length();
       String [] arr= s.split(" ");  //spilting the string 
        String word = arr[arr.length - 1];
        return word.length();
    }
}