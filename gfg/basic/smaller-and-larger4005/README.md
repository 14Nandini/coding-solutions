# Smaller and Larger in Sorted

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a sorted array  **arr[]**  and a value  **target**, return an array of size 2. The first value is the number of elements less than or equal to the target, and the second value is the number of elements greater than or equal to the target.

 **Examples:** 

```
Input: arr[] = [1, 2, 8, 10, 11, 12, 19], target = 0
Output: [0, 7]
Explanation: There are no elements less or equal to 0 and 7 elements greater to 0.
```

```
Input: arr[] = [1, 5, 8, 12, 12, 12, 19], target = 12
Output: [6, 4]
Explanation: There are 6 elements less or equal to 12 and 4 elements greater or equal to 12.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-31T04:39:40.456Z  

```java
class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        // code here
        int lessCnt = 0, grtCnt = 0;
        for(int a : arr){
            if(a >= target) grtCnt++;
            if(a <= target) lessCnt++;
        }
        return new int[]{lessCnt, grtCnt};
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/smaller-and-larger4005/1)