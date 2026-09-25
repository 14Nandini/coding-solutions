class Solution {
    public String checkCoupon(int n, int x, int y, int[] prices) {
        // write your code here 
        int save = 0;
        for(int i = 0; i < n; i++){
            if(prices[i] >= y){
                save += y;
            }
            else save += prices[i];
        }
        if(save > x) return "COUPON";
        else return "NO COUPON";
    }
}
