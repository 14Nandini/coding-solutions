# array-subset-of-another-array2317

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T13:22:11.563Z  

```java
class Solution {
    public boolean isSubset(int a[], int b[]) {

        Map<Integer, Integer> map = new HashMap();
        for(int x : a){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for(int y:b){
            if(!map.containsKey(y) || map.get(y) == 0) return false;
            else map.put(y, map.get(y) - 1);
        }
        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/1)