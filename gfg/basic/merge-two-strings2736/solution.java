class Solution {
    String merge(String s1, String s2) {
        // code here
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while(i < s1.length() && j < s2.length()){
            sb.append(s1.charAt(i));
            sb.append(s2.charAt(j));
            i++;
            j++;
        }
        if(i < s1.length()) sb.append(s1.substring(i));
        if(j < s2.length()) sb.append(s2.substring(j));
        return sb.toString();
    }
}