# Target Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `nums` and an integer `target`.

You want to build an  **expression**  out of nums by adding one of the symbols `'+'` and `'-'` before each integer in nums and then concatenate all the integers.

- For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression "+2-1".

Return the number of different  **expressions**  that you can build, which evaluates to `target`.

 

 **Example 1:** 

```
Input: nums = [1,1,1,1,1], target = 3
Output: 5
Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
-1 + 1 + 1 + 1 + 1 = 3
+1 - 1 + 1 + 1 + 1 = 3
+1 + 1 - 1 + 1 + 1 = 3
+1 + 1 + 1 - 1 + 1 = 3
+1 + 1 + 1 + 1 - 1 = 3

```

 **Example 2:** 

```
Input: nums = [1], target = 1
Output: 1

```

 

 **Constraints:** 

- 1 <= nums.length <= 20
- 0 <= nums[i] <= 1000
- 0 <= sum(nums[i]) <= 1000
- -1000 <= target <= 1000

## Solution

**Language:** Java  
**Runtime:** 62 ms (beats 43.34%)  
**Memory:** 47.1 MB (beats 14.21%)  
**Submitted:** 2026-09-09T06:27:57.477Z  

```java
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        hm1.put(0,1);
        for(int num : nums){
            HashMap<Integer, Integer> hm2 = new HashMap<>();
            for(int sum : hm1.keySet()){
                int c = hm1.get(sum);
                hm2.put(sum + num, hm2.getOrDefault(sum + num, 0) + c);
                hm2.put(sum - num, hm2.getOrDefault(sum - num, 0) + c);
            }
            hm1 = hm2;
        }
        return hm1.getOrDefault(target, 0);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/target-sum/)