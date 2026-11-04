# Average Value of Even Numbers That Are Divisible by Three

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums` of  **positive**  integers, return  *the average value of all even integers that are divisible by*  `3` *.* 

Note that the  **average**  of `n` elements is the  **sum**  of the `n` elements divided by `n` and  **rounded down**  to the nearest integer.

 

 **Example 1:** 

```
Input: nums = [1,3,6,10,12,15]
Output: 9
Explanation: 6 and 12 are even numbers that are divisible by 3. (6 + 12) / 2 = 9.

```

 **Example 2:** 

```
Input: nums = [1,2,4,7,10]
Output: 0
Explanation: There is no single number that satisfies the requirement, so return 0.

```

 

 **Constraints:** 

- 1 <= nums.length <= 1000
- 1 <= nums[i] <= 1000

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 79.70%)  
**Memory:** 46.2 MB (beats 73.74%)  
**Submitted:** 2026-11-04T07:10:32.985Z  

```java
class Solution {
    public int averageValue(int[] nums) {
        int sum = 0, cnt = 0;
        for(int num : nums){
            if(num % 2 == 0 && num % 3 == 0){
                cnt++;
                sum += num;
            }
        }
        if(sum == 0 || cnt == 0) return 0;
        else return sum/cnt;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-three/)