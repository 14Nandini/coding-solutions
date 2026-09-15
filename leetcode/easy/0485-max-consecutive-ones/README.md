# Max Consecutive Ones

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a binary array `nums`, return  *the maximum number of consecutive* `1` *'s in the array*.

 

 **Example 1:** 

```
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

```

 **Example 2:** 

```
Input: nums = [1,0,1,1,0,1]
Output: 2

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- nums[i] is either 0 or 1.

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.4 MB  
**Submitted:** 2026-09-15T07:23:27.049Z  

```java
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 1, max = 1;
        if(nums[0] == 1) c++;
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] == 1 && nums[i] == 1){
                c++;
                max = Math.max(c, max);
            }
            else c = 1;
        }
        return max;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/max-consecutive-ones/)