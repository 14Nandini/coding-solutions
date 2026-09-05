class Solution {
    public void mergeTwoParts(int[] arr) {
        // code here
        int n = arr.length;
        int mid = n;
        for(int i = 1; i < n; i++){
            if(arr[i-1] > arr[i]){
                mid = i;
                break;
            }
        }
        if(mid == n) return;
        int[] temp = new int[n];
        int p1 = 0, p2= mid, idx = 0;
        while(p1 < mid && p2 < n){
            if(arr[p1] <= arr[p2])
                temp[idx++] = arr[p1++];
            else 
                temp[idx++] = arr[p2++];
        }
        while(p1 < mid) temp[idx++] = arr[p1++];
        while(p2 < n) temp[idx++] = arr[p2++];
        
        for(int i = 0; i < n; i++) arr[i] = temp[i];
    }
}