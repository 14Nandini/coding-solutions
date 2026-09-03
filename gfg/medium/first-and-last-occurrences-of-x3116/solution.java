class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = arr.length - 1;
        while(i <= j){
            if(arr[i] != x) i++;
            if(arr[j] != x) j--;
            if(arr[i] == x && arr[j] == x){
                break;
            }
        }
        if(i > j){
            res.add(-1);
            res.add(-1);
        }
        else{
            res.add(i);
            res.add(j);
        }
        return res;
    }
}
