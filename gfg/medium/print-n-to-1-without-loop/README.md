# print-n-to-1-without-loop

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-20T06:12:59.323Z  

```java
class Solution {
    public void printNos(int n) {
        // code here
        if(n == 0) return;
        
        System.out.print(n + " ");
        printNos(n-1);

    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-n-to-1-without-loop/1)