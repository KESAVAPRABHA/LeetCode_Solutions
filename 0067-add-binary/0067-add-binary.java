import java.math.*;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger b1 = new BigInteger(a, 2);  // Convert binary string 'a' to BigInteger
        BigInteger b2 = new BigInteger(b, 2);  // Convert binary string 'b' to BigInteger
        return b1.add(b2).toString(2); 
    }
}