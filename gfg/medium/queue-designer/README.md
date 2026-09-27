# queue-designer

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-27T15:33:41.144Z  

```java
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
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/queue-designer/1)