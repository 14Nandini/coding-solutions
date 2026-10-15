# Single Number II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums` where every element appears  **three times**  except for one, which appears  **exactly once**.  *Find the single element and return it*.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

 **Example 1:** 

```
Input: nums = [2,2,3,2]
Output: 3

```

 **Example 2:** 

```
Input: nums = [0,1,0,1,0,1,99]
Output: 99

```

 

 **Constraints:** 

- 1 <= nums.length <= 3 * 104
- -231 <= nums[i] <= 231 - 1
- Each element in nums appears exactly three times except for one element which appears once.

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 20.04%)  
**Memory:** 45.7 MB (beats 33.32%)  
**Submitted:** 2026-10-15T16:18:55.166Z  

```java
class Solution {
    public int singleNumber(int[] nums) {
         HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
           map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int ans = 0;
        for(Map.Entry<Integer, Integer> hm : map.entrySet()){
            if(hm.getValue().equals(1)){
                ans = hm.getKey();
            }
        }
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/single-number-ii/)