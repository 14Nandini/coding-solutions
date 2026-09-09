# Climbing Stairs

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are climbing a staircase. It takes `n` steps to reach the top.

Each time you can either climb `1` or `2` steps. In how many distinct ways can you climb to the top?

 

 **Example 1:** 

```
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

```

 **Example 2:** 

```
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

```

 

 **Constraints:** 

- 1 <= n <= 45

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.2 MB (beats 35.81%)  
**Submitted:** 2026-09-09T15:59:02.161Z  

```java
class Solution {
    public int climbStairs(int n) {
        if(n == 1) return 1;
        int[] res = new int[n + 1];
        res[1] = 1;
        res[2] = 2;
        for(int i = 3; i <= n; i++){
            res[i] = res[i - 1] + res[ i - 2];
        }
        return res[n];
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/climbing-stairs/)