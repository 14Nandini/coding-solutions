# Number of Segments in a String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, return  *the number of segments in the string*.

A  **segment**  is defined to be a contiguous sequence of  **non-space characters**.

 

 **Example 1:** 

```
Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]

```

 **Example 2:** 

```
Input: s = "Hello"
Output: 1

```

 

 **Constraints:** 

- 0 <= s.length <= 300
- s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:".
- The only space character in s is ' '.

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.5 MB  
**Submitted:** 2026-09-10T07:18:21.878Z  

```java
class Solution {
    public int countSegments(String s) {
        if(s.isEmpty()) return 0;
        String[] res = s.split(" ");
        return res.length;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/number-of-segments-in-a-string/)