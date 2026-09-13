class Solution {
    ArrayList<Integer> remDuplicate(int arr[]) {
        // code here
        HashSet<Integer> hs = new HashSet<>();
        for(int num : arr) hs.add(num);
        ArrayList<Integer> res = new ArrayList<>();
        for(int num : hs)  res.add(num);
        return res;
    }
}