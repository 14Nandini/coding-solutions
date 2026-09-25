class Solution {
    public int findDuplicate(int[] arr, int k) {
        // code here
        int[] freq = new int[10001];
        for ( int i : arr ) {
            freq[i]++;
        }
        for ( int i = 0 ; i < 10001 ; i++ ) {
            if ( freq[i] == k ) return i;
        }
        return -1;
    }
};