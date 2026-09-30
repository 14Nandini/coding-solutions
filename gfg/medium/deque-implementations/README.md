# deque-implementations

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T09:35:39.490Z  

```java
class Solution {
    public static void pb(ArrayDeque<Integer> dq, int x) {
        //  code here
        dq.addLast(x);
    }

    public static void ppb(ArrayDeque<Integer> dq) {
        //  code here
        if (!dq.isEmpty()) dq.removeLast();
    }

        
    public static int front_dq(ArrayDeque<Integer> dq) {
        //  code here
        if (!dq.isEmpty()) return dq.peekFirst();
        return -1;
        
    }
        

    public static void pf(ArrayDeque<Integer> dq, int x) {
        //  code here
        dq.addFirst(x);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/deque-implementations/1)