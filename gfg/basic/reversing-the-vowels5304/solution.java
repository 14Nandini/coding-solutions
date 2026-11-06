class Solution {
    String modify(String s) {
        StringBuilder vow = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(isVowel(ch))
                vow.append(ch);
        }
        vow.reverse();
        StringBuilder res = new StringBuilder();
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                res.append(vow.charAt(j));
                j++;
            } else {
                res.append(ch);
            }
        }
        return res.toString();
    }
    boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}