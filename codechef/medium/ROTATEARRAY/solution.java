static void rotate(int[] nums, int k) {
    // write your code here
    Deque<Integer> dq = new ArrayDeque<>();
    for(int num : nums) dq.addLast(num);
    for(int i = 0; i < k; i++){
        int last = dq.pollLast();
        dq.offerFirst(last);
    }
    int i = 0;
    while (!dq.isEmpty()) {
        nums[i++] = dq.pollFirst();
    }
    
}