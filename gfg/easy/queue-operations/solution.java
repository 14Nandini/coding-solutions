class Geeks {
    static void enqueue(Queue<Integer> q, int k) {
        //  code here
        q.offer(k);
    }

    static int findFrequency(Queue<Integer> q, int k) {
        int c = 0;
        for(int key : q){
            if(key == k) c++;
        }
        return c;
    }
}