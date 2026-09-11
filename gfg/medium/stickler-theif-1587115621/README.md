# Stickler Thief

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Stickler the thief wants to loot money from the houses arranged in a line. He cannot loot two consecutive houses and aims to maximize his total loot. Given an array,  **arr[]**  where arr[i] represents the amount of money in the i-th house. Find the maximum amount he can loot.

 **Examples:** 

```
Input: arr[] = [6, 7, 1, 3, 8, 2, 4]
Output: 19
Explanation: Maximum amount he can get by looting 1st, 3rd, 5th and 7th house, which is 6 + 1 + 8 + 4 = 19.
```

```
Input: arr[] = [5, 3, 4, 11, 2]
Output: 16
Explanation: Maximum amount he can get by looting 1st and 4th house, which is 5 + 11 = 16.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-11T04:22:00.693Z  

```java
class Solution {
    public int findMaxSum(int arr[]) {
        // code here
        int n = arr.length;
        if(n < 2) return arr[0];
        int[] res = new int[n];
        res[0] = arr[0];
        res[1] = Math.max(arr[0], arr[1]);
        for(int i = 2; i < n; i++){
            res[i] = Math.max((res[i-2] + arr[i]), res[i-1]);
        }
        return res[n - 1];
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/stickler-theif-1587115621/1)