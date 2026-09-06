class Geeks {

    // Function to insert k into the priority queue q
    static void insert(PriorityQueue<Integer> q, int k) {
        // code here
        q.add(k);
        
    }

    // If k is in q return true else return false
    static boolean find(PriorityQueue<Integer> q, int k) {
        // code here
        return q.contains(k);
    }

    // Function to delete the max element from priority queue
    static int delete(PriorityQueue<Integer> q) {
        // code here
        return q.poll();
    }
}