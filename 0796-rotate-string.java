class Solution {
    public boolean rotateString(String s, String goal) {
        // Strings must be equal in length to be valid rotations
        if (s.length() != goal.length()) {
            return false;
        }
        
        // Check if goal is a substring of (s + s)
        return (s + s).contains(goal);
    }
}