class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int idx = 0;
        for(int num : arr){
            if(num != 0){
                arr[idx] = num;
                idx++;
            }
        }
        while(idx < arr.length){
            arr[idx] = 0;
            idx++;
        }
    }
}