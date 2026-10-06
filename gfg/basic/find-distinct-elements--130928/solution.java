class Solution {
    public int countDistinct(int arr[]) {
        // code here
        HashSet<Integer> hs = new HashSet<>();
        for(int a : arr) hs.add(a);
        return hs.size();
    }
}