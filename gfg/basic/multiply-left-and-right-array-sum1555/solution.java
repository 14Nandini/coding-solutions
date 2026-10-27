class Solution {
    public int multiply(int[] arr) {
        // code here
        int n = arr.length;
        int leftSum = 0, rightSum = 0;
        for(int i = 0; i < n/2; i++){
            leftSum += arr[i];
        }
        for(int i = n/2; i < n; i++) rightSum += arr[i];
        return leftSum * rightSum;
    }
}
