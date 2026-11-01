class Solution {
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        for(int a : arr) hs.add(a);
        return new ArrayList<>(hs);
    }
}