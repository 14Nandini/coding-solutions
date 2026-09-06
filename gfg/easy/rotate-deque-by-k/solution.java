class Solution {
    public static void rotateDeque(Deque<Integer> dq, int type, int k) {
        // code here
        int c = 0, temp;
        if(type == 1){
            while(c < k){
                temp = dq.pollLast();
                dq.addFirst(temp);
                c++;
            }
        }
        else{
            while(c < k){
                temp = dq.pollFirst();
                dq.addLast(temp);
                c++;
            }
        }
    }
}