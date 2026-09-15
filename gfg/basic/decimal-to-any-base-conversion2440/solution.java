class Solution {
    public String decimalToBase(int b, int n) {
        // code here
        if(n == 0) return "0";
        StringBuilder sb = new StringBuilder();
        String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        while(n > 0){
            int r = n % b;
            sb.append(digits.charAt(r));
            n = n / b;
        }
        return sb.reverse().toString();
    }
}