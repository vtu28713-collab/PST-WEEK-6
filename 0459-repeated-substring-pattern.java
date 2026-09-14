class Solution {
    public boolean repeatedSubstringPattern(String s) {
        // Concatenate string s with itself
        String doubled = s + s;
        
        // Remove the first and last characters and check if s exists within it
        return doubled.substring(1, doubled.length() - 1).contains(s);
    }
}