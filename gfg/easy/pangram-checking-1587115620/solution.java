class Solution {
    public static boolean checkPangram(String s) {
        // code here
        
        int n = s.length();
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            ch = Character.toLowerCase(ch);
            if(ch >= 'a' && ch <= 'z')
                freq[ch - 'a'] = 1;
        }
        for(int i = 0; i < freq.length; i++){
            if(freq[i] == 0) return false;
        }
        return true;
    }
}