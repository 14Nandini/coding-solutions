class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        Arrays.sort(arr);
        return new ArrayList<>(Arrays.asList(arr[0], arr[arr.length-1]));
        
    }
}
