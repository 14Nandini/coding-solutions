class Solution {
    public int lastWordLen(String s) {
        // code here
        int len = 0, i = s.length()- 1;
        while(i >= 0 && s.charAt(i) == ' ') i--;
        while(i >= 0 && s.charAt(i) != ' '){
            len++;
            i--;
        }
        return len;
    }
}