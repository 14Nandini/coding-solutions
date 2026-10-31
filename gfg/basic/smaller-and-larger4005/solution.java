class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        // code here
        int lessCnt = 0, grtCnt = 0;
        for(int a : arr){
            if(a >= target) grtCnt++;
            if(a <= target) lessCnt++;
        }
        return new int[]{lessCnt, grtCnt};
    }
}