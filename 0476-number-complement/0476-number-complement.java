class Solution {
    public int findComplement(int num) {
        //convert to binary string
        int len = Integer.toBinaryString(num).length();
        //create a mask of 'len' length of 1s
        //for this we use left shift <<

        int mask = (1<<len) - 1;
        return num ^ mask;
    }
}