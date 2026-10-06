# Max Product Pair

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array **arr[]**  of non-negative integers, find the maximum product of any two elements present in the array.

 **Example:** 

```
Input: arr[] = [1, 4, 3, 6, 7, 0] 
Output: 42
Explanation: 6 and 7 have the maximum product.
```

```
Input: arr[] = [1, 100, 42, 4, 23]
Output: 4200
Explanation:  42 and 100 have the maximum product.
```

 **Constraints:** 
2 ≤ arr.size ≤ 107
0 ≤ arr[i] ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T15:19:41.785Z  

```java
class Solution {
    public static int maxProduct(int[] arr) {
        // code here
        Arrays.sort(arr);
        int last = arr.length - 1;
        int beforeLast = last - 1;
        return arr[last] * arr[beforeLast];
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximum-product-of-two-numbers2730/1)