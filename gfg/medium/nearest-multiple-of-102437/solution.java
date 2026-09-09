class Solution {
    public String roundToNearest(String s) {
        // Code Here
        int n = s.length();
        char lastChar = s.charAt(n - 1);
        StringBuilder sb = new StringBuilder(s);
        
        if(lastChar <= '5'){
            sb.setCharAt(n - 1, '0');
            return sb.toString();
        }
        else{
            sb.setCharAt(n-1, '0');
            int carry = 1;
            for(int i = n-2; i >= 0; i--){
                int currDigit = sb.charAt(i) - '0' + carry;
                if(currDigit == 10){
                    sb.setCharAt(i, '0');
                    carry = 1;
                }
                else{
                    sb.setCharAt(i, (char)(currDigit + '0'));
                    carry = 0;
                    break;
                }
            }
            if(carry == 1){
                sb.insert(0, '1');
            }
            return sb.toString();
        }
        
    }
}
