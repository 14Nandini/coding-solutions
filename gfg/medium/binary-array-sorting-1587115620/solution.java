class Solution {
    public void binSort(int[] arr) {
        // code here
        int c = 0, i = 0;
        for(int num : arr){
            if(num == 0){
                arr[i] = 0;
                i++;
            }
            else c++;
        }
        while(c > 0){
            arr[i] = 1;
            c--;
            i++;
        }
    }
}
