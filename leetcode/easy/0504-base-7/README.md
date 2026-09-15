# Base 7

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `num`, return  *a string of its  **base 7**  representation*.

 

 **Example 1:** 

```
Input: num = 100
Output: "202"

```

 **Example 2:** 

```
Input: num = -7
Output: "-10"

```

 

 **Constraints:** 

- -107 <= num <= 107

## Solution

**Language:** Java  
**Runtime:** 2 ms  
**Memory:** 42.6 MB  
**Submitted:** 2026-09-15T13:35:51.578Z  

```java
class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return "0";
        boolean isNegative = false;
        if(num < 0){
            isNegative = true;
            num = Math.abs(num);
        }
        StringBuilder sb = new StringBuilder();
        while(num > 0){
            int res = num % 7;
            sb.insert(0, res);
            num = num / 7;
        }
        String res = sb.toString();
        return isNegative ? "-" + res : res;
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/base-7/)