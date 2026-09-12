class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        if(n % 2 != 0) return false;
        String s1 = s.substring(0, n/2);
        String s2 = s.substring(n/2, n);
        return s1.equals(s2);
    }
}