class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        int l1 = s1.length(), l2 = s2.length();
        if(l1 != l2) return false;
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
}