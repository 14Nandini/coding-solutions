# smallest-number-repeating-k-times3239

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T13:34:55.548Z  

```java
class Solution {
    public int findDuplicate(int[] arr, int k) {
        // code here
        int[] freq = new int[10001];
        for ( int i : arr ) {
            freq[i]++;
        }
        for ( int i = 0 ; i < 10001 ; i++ ) {
            if ( freq[i] == k ) return i;
        }
        return -1;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/smallest-number-repeating-k-times3239/1)