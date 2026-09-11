class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        HashSet<Integer> hs = new HashSet<>();
        for(int num : arr) hs.add(num);
        ArrayList<Integer> al = new ArrayList<>(hs);
        Collections.sort(al);
        return al;
    }
}
