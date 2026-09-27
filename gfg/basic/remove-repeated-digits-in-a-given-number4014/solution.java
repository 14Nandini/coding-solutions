class Solution {
    public long modify(long N) {
        // code here
        StringBuilder sb = new StringBuilder();
        long prev = -1;
        while(N > 0){
            long curr = N % 10;
            if(prev != curr) sb.append(curr);
            prev = curr;
            N = N / 10;
        }
        sb.reverse();
        return Long.parseLong(sb.toString());
        
    }
}