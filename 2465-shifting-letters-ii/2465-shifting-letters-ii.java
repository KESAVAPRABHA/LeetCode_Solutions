class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        long[] diff = new long[n + 1];
        
        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2];
            
            int value = direction == 1 ? 1 : -1;
            diff[start] += value;
            diff[end + 1] -= value;
        }
        
        StringBuilder result = new StringBuilder(s);
        long currentShift = 0;
        
        for (int i = 0; i < n; i++) {
            currentShift += diff[i];
            int originalPos = result.charAt(i) - 'a';
            int newPos = (int)(((originalPos + currentShift) % 26 + 26) % 26);
            result.setCharAt(i, (char)(newPos + 'a'));
        }
        
        return result.toString();
    }
}