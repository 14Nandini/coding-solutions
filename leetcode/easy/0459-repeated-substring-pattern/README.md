# Repeated Substring Pattern

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

 

 **Example 1:** 

```
Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.

```

 **Example 2:** 

```
Input: s = "aba"
Output: false

```

 **Example 3:** 

```
Input: s = "abcabcabcabc"
Output: true
Explanation: It is the substring "abc" four times or the substring "abcabc" twice.

```

 

 **Constraints:** 

- 1 <= s.length <= 104
- s consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.9 MB  
**Submitted:** 2026-09-12T07:10:59.940Z  

```java
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        if(n % 2 != 0) return false;
        String s1 = s.substring(0, n/2);
        String s2 = s.substring(n/2, n);
        return s1.equals(s2);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/repeated-substring-pattern/)