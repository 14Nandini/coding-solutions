class Solution {
    public void rotateclockwise(int[] arr, int k) {
        // code here
        int n = arr.length;
        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            res[(i + k) % n] = arr[i];
        }
        for(int i = 0; i < n; i++) arr[i] = res[i];
    }
}