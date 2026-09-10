class Solution {
    public int countSegments(String s) {
        if(s.isEmpty()) return 0;
        String[] res = s.split(" ");
        return res.length;
    }
}