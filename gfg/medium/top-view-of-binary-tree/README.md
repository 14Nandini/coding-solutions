# Top View of Binary Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given the  **root**  of a binary tree, and your task is to return its  **top view**. The top view of a binary tree is the set of nodes visible when the tree is viewed from the top.

 **Note:** 

- Return the nodes from the leftmost node to the rightmost node.
- If multiple nodes overlap at the same horizontal position, only the topmost (closest to the root) node is included in the view. 

 **Examples:** 

```
Input: root = [1, 2, 3]
Output: [2, 1, 3]
Explanation: The Green colored nodes represents the top view in the below Binary tree.
 
```

```
Input: root = [10, 20, 30, 40, 60, 90, 100]
Output: [40, 20, 10, 30, 100]
Explanation: The Green colored nodes represents the top view in the below Binary tree.

```

 **Constraints:** 
1 ≤ number of nodes ≤ 105
1 ≤ node->data ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-04T14:22:22.682Z  

```java
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
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1)