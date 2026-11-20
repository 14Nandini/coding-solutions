class Solution {
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int x : arr) {
            if(!al.isEmpty()) {
                int last = al.get(al.size() - 1);
                boolean lastIdx = last >= 0;
                boolean currIdx = x >= 0;
                if (lastIdx != currIdx) {
                    al.remove(al.size() - 1);
                    continue;
                }
            }
            al.add(x);
        }
        return al;
    }
}
