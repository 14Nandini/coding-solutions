class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        // code here
        HashSet<Integer> ahs = new HashSet<>();
        for(int val : a) ahs.add(val);
        HashSet<Integer> bhs = new HashSet<>();
        for(int val : b){
            if(ahs.contains(val)) bhs.add(val);;
        }
        return new ArrayList<Integer>(bhs);
    }
}