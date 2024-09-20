class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();

        // Start from the end of both strings
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        // Perform digit by digit addition
        while (i >= 0 || j >= 0 || carry != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;  // Get digit from num1 or 0 if index is out of bounds
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;  // Get digit from num2 or 0 if index is out of bounds
            int sum = x + y + carry;  // Sum the digits and carry

            result.append(sum % 10);  // Append the last digit of sum
            carry = sum / 10;  // Update the carry for the next iteration

            i--;
            j--;
        }

        return result.reverse().toString();  // Reverse the result to get the correct order
    }
}
