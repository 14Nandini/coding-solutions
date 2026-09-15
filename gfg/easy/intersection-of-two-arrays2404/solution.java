class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        HashSet<Integer> hs = new HashSet<>();
        for(int num : a) hs.add(num);
        int c = 0;
        for(int num : b){
            if(hs.contains(num)) c++;
        }
        return c;
    }
}