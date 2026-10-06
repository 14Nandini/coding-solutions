class Solution {
    public int maxChildren(int[] greed, int[] cookie) {
        // code here
        Arrays.sort(greed);
        Arrays.sort(cookie);
        int i = 0, j = 0, c = 0;
        while(i < greed.length && j < cookie.length){
            if(greed[i] <= cookie[j]){
                c++;
                i++;
                j++;
            }
            else j++;
        }
        return  c;
    }
}