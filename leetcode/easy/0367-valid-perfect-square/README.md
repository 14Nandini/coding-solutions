# Valid Perfect Square

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a positive integer num, return `true`  *if*  `num`  *is a perfect square or*  `false`  *otherwise*.

A  **perfect square**  is an integer that is the square of an integer. In other words, it is the product of some integer with itself.

You must not use any built-in library function, such as `sqrt`.

 

 **Example 1:** 

```
Input: num = 16
Output: true
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.

```

 **Example 2:** 

```
Input: num = 14
Output: false
Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.

```

 

 **Constraints:** 

- 1 <= num <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 19.39%)  
**Memory:** 41.4 MB (beats 93.51%)  
**Submitted:** 2026-11-02T14:30:49.173Z  

```java
class Solution {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-perfect-square/)