# To Lower Case

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, return  *the string after replacing every uppercase letter with the same lowercase letter*.

 

 **Example 1:** 

```
Input: s = "Hello"
Output: "hello"

```

 **Example 2:** 

```
Input: s = "here"
Output: "here"

```

 **Example 3:** 

```
Input: s = "LOVELY"
Output: "lovely"

```

 

 **Constraints:** 

- 1 <= s.length <= 100
- s consists of printable ASCII characters.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 32.09%)  
**Memory:** 42.7 MB (beats 79.12%)  
**Submitted:** 2026-10-30T14:43:09.137Z  

```java
class Solution {
    public String toLowerCase(String s) {
        String res = s.toLowerCase();
        return res;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/to-lower-case/)