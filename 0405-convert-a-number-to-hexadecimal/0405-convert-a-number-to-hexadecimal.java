public class Solution {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        while (num != 0) {
            int digit = num & 15; // Extract the last four bits
            char hexChar = (digit < 10) ? (char) ('0' + digit) : (char) ('a' + digit - 10);
            result.insert(0, hexChar); //as we checking from the last insert all term from 0th position
            num >>>= 4; // Right shift by 4 bits
        }

        return result.toString();
    }
}