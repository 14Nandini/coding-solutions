class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        // code here
        int i = 0, sum = 0, res = Integer.MAX_VALUE;
        for(int j = 0; j < arr.length; j++){
            sum += arr[j];
            while(sum > x){
                res = Math.min(res, (j-i+1));
                sum -= arr[i];
                i++;
            }
        }
        return (res == Integer.MAX_VALUE) ? 0 : res;
    }
}
