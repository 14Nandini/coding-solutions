class Solution {
    public boolean checkString(String s) {
        if(s.length() == 1) return true;
        int aidx = s.lastIndexOf('a');
        int bidx = s.indexOf('b');
        if( aidx > bidx) return false;
        return true;
    }
}