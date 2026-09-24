# product-is-even-or-odd3020

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T15:37:59.204Z  

```java
class Solution {
    public boolean isProductEven(ArrayList<Integer> arr) {
        // code here.
        int prod = 1;
        for(int num : arr){
            prod = prod * num;
        }
        if(prod % 2 == 0) return true;
        else return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/product-is-even-or-odd3020/1)