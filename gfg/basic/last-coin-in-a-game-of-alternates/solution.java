class Solution {
    public int coin(int[] arr) {
        // code here
        int min = Integer.MAX_VALUE;
        for(int num : arr){
            if(num < min) min = num;
        }
        return min;
    }
}