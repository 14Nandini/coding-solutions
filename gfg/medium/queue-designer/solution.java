class Solution {

    public Queue<Integer> fillQ(int[] arr) {
        
        Queue<Integer> q = new LinkedList<>();
        for (int num : arr) {
            q.add(num);
        }
        return q;
    }

    public void emptyQ(Queue<Integer> q) {
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
        System.out.println();
    }
}