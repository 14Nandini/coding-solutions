/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Solution {
    static class Pair {
        Node node;
        int hd;
        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
    public ArrayList<Integer> topView(Node root) {
            ArrayList<Integer> res = new ArrayList<>();
            if (root == null) return res;

            Map<Integer, Integer> map = new HashMap<>();

            Queue<Pair> q = new LinkedList<>();

            int minHd = 0;
            int maxHd = 0;

            q.add(new Pair(root, 0));

            while (!q.isEmpty()) {
                Pair curr = q.poll();
                Node node = curr.node;
                int hd = curr.hd;

                if (!map.containsKey(hd)) {
                    map.put(hd, node.data);
                }

                minHd = Math.min(minHd, hd);
                maxHd = Math.max(maxHd, hd);

                if (node.left != null) {
                    q.add(new Pair(node.left, hd - 1));
                }
                if (node.right != null) {
                    q.add(new Pair(node.right, hd + 1));
                }
            }

            Stack<Integer> st = new Stack<>();
            for (int i = -1; i >= minHd; i--) {
                if (map.containsKey(i)) {
                    st.push(map.get(i));
                }
            }

            while (!st.isEmpty()) {
                res.add(st.pop());
            }

            if (map.containsKey(0)) {
                res.add(map.get(0));
            }

            for (int i = 1; i <= maxHd; i++) {
                if (map.containsKey(i)) {
                    res.add(map.get(i));
                }
            }

            return res;
        }   
}