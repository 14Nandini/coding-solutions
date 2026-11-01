# remove-duplicates-from-unsorted-array4141

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-01T08:37:15.113Z  

```java
class Solution {
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        for(int a : arr) hs.add(a);
        return new ArrayList<>(hs);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-duplicates-from-unsorted-array4141/1)