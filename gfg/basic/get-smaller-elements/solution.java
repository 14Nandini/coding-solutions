class Solution {
    public ArrayList<Integer> getSmaller(int arr[], int target) {
        // code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int a : arr){
            if(a < target) res.add(a);
        }
        return res;
    }
}