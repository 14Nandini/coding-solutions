# Alternating Digit Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a positive integer `n`. Each digit of `n` has a sign according to the following rules:

- The most significant digit is assigned a positive sign.
- Each other digit has an opposite sign to its adjacent digits.

Return  *the sum of all digits with their corresponding sign*.

 

 **Example 1:** 

```
Input: n = 521
Output: 4
Explanation: (+5) + (-2) + (+1) = 4.

```

 **Example 2:** 

```
Input: n = 111
Output: 1
Explanation: (+1) + (-1) + (+1) = 1.

```

 **Example 3:** 

```
Input: n = 886996
Output: 0
Explanation: (+8) + (-8) + (+6) + (-9) + (+9) + (-6) = 0.

```

 

 **Constraints:** 

- 1 <= n <= 109

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42 MB (beats 51.98%)  
**Submitted:** 2026-11-06T14:47:19.170Z  

```java
class Solution {
    public int alternateDigitSum(int n) {

        int digits = 0;
        int tmp = n;

        while (tmp != 0) {
            digits++;
            tmp /= 10;
        }

        int sum = 0;
        int sign = (digits & 1) == 0 ? -1 : 1;

        while (n != 0) {
            sum += (n % 10) * sign;
            sign *= -1;
            n /= 10;
        }

        return sum;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/alternating-digit-sum/)