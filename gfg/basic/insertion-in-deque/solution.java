class Solution {
    public Deque<Integer> dqInsertion(List<Integer> arr) {
        // code here
        Deque<Integer> dq = new ArrayDeque<>();
        for(int e : arr){
            dq.addLast(e);
        }
        return dq;
    }
}