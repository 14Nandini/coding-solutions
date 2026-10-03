class Solution {
    public void eraseAt(ArrayDeque<Integer> deq, int x) {
        // code here
        List<Integer> list = new ArrayList<>(deq);
        list.remove(x);
        deq.clear();
        deq.addAll(list);
        
    }

    public void eraseInRange(ArrayDeque<Integer> deq, int start, int end) {
        // code here
        List<Integer> list = new ArrayList<>(deq);
        for(int i = end - 1; i >= start; i--){
            list.remove(i);
        }
        deq.clear();
        deq.addAll(list);
    }

        
    public void eraseAll(ArrayDeque<Integer> deq) {
        // code here
        deq.clear();
    }
}