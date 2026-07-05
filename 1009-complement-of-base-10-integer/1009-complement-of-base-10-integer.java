class Solution {
    public int bitwiseComplement(int n) {
        //convert into binary

        int len = Integer.toBinaryString(n).length();

        //create a mask
        int mask;
        mask = (1 << len);
       mask-=1;
        return n ^ mask;
    }
}