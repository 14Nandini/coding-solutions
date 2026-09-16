# Find Closest Number to Zero

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums` of size `n`, return  *the number with the value  **closest**  to* `0` *in* `nums`. If there are multiple answers, return  *the number with the  **largest**  value*.

 

 **Example 1:** 

```
Input: nums = [-4,-2,1,4,8]
Output: 1
Explanation:
The distance from -4 to 0 is |-4| = 4.
The distance from -2 to 0 is |-2| = 2.
The distance from 1 to 0 is |1| = 1.
The distance from 4 to 0 is |4| = 4.
The distance from 8 to 0 is |8| = 8.
Thus, the closest number to 0 in the array is 1.

```

 **Example 2:** 

```
Input: nums = [2,-1,1]
Output: 1
Explanation: 1 and -1 are both the closest numbers to 0, so 1 being larger is returned.

```

 

 **Constraints:** 

- 1 <= n <= 1000
- -105 <= nums[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 82.88%)  
**Memory:** 46.8 MB (beats 57.41%)  
**Submitted:** 2026-09-16T15:26:47.178Z  

```java
class Solution {
    public int findClosestNumber(int[] nums) {
        int minDist = Math.abs(nums[0]);
        int closest = nums[0];
        for(int num : nums){
            int abs = Math.abs(num);
            if(abs < minDist || (abs == minDist && num > closest)){
                closest = num;
                minDist = abs;
            }
        }
        return closest;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-closest-number-to-zero/)