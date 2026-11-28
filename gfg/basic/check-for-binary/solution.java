class Solution {
    public boolean isBinary(String s) {
        // code here
        for (char c : s.toCharArray()) {
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }
}