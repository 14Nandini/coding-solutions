class Solution {
    public boolean checkString(String s) {
        int aidx = s.lastIndexOf('a');
        int bidx = s.indexOf('b');
        if( aidx > bidx) return false;
        return true;
    }
}