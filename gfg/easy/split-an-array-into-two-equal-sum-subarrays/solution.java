class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int n = arr.length - 1;
        int totalSum = 0;
        for(int num : arr) totalSum += num;
        int temp = 0;
        for(int i = n; i >= 0; i--){
            temp += arr[i];
            totalSum -= arr[i];
            if(temp == totalSum) return true;
        }
        return false;
    }
}