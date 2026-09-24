class Solution {
    public boolean isProductEven(ArrayList<Integer> arr) {
        // code here.
        int prod = 1;
        for(int num : arr){
            prod = prod * num;
        }
        if(prod % 2 == 0) return true;
        else return false;
    }
}