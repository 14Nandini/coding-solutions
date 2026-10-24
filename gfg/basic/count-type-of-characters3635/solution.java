class Sol {
    int[] count(String s) {
        // your code here
        int lcnt = 0, ucnt = 0, scnt = 0, ncnt = 0;
        for(char ch : s.toCharArray()){
            if(Character.isLowerCase(ch)) lcnt ++;
            else if(Character.isUpperCase(ch)) ucnt++;
            else if(Character.isDigit(ch)) ncnt++;
            else scnt++;
        }
        return new int[]{ucnt, lcnt, ncnt, scnt};
    }
}