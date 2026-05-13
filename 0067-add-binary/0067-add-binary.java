import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        // Convert binary strings to BigInteger
        BigInteger a1 = new BigInteger(a, 2);
        BigInteger a2 = new BigInteger(b, 2);

        // Add them
        BigInteger sum = a1.add(a2);

        // Convert back to binary string
        return sum.toString(2);
    }
}