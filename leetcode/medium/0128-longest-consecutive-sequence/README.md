# Longest Consecutive Sequence

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an unsorted array of integers `nums`, return  *the length of the longest consecutive elements sequence.* 

You must write an algorithm that runs in `O(n)` time.

 

 **Example 1:** 

```
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

```

 **Example 2:** 

```
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9

```

 **Example 3:** 

```
Input: nums = [1,0,1,2]
Output: 3

```

 

 **Constraints:** 

- 0 <= nums.length <= 105
- -109 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 31 ms (beats 59.11%)  
**Memory:** 95.7 MB (beats 27.18%)  
**Submitted:** 2026-09-05T05:05:35.938Z  

```java
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums) hs.add(num);
        int maxCnt = 0;
        for(int num : hs){
            if(!hs.contains(num - 1)){
                int cNum = num;
                int c = 1;
                while(hs.contains(cNum + 1)){
                    cNum += 1;
                    c += 1;
                }
                maxCnt = (c > maxCnt) ? c : maxCnt;
            }
        }
        return maxCnt;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-consecutive-sequence/)