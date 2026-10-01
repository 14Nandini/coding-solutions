# Reverse String II

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s` and an integer `k`, reverse the first `k` characters for every `2k` characters counting from the start of the string.

If there are fewer than `k` characters left, reverse all of them. If there are less than `2k` but greater than or equal to `k` characters, then reverse the first `k` characters and leave the other as original.

 

 **Example 1:** 

```
Input: s = "abcdefg", k = 2
Output: "bacdfeg"

```

 **Example 2:** 

```
Input: s = "abcd", k = 2
Output: "bacd"

```

 

 **Constraints:** 

- 1 <= s.length <= 104
- s consists of only lowercase English letters.
- 1 <= k <= 104

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 96.46%)  
**Memory:** 44.9 MB (beats 43.39%)  
**Submitted:** 2026-10-01T05:48:52.984Z  

```java
class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i += 2 * k) {
            int end = Math.min(s.length(), i+k);
            StringBuilder temp = new StringBuilder(s.substring(i,end));
            temp.reverse();

            sb.replace(i, end, temp.toString());
        }
        return sb.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-string-ii/)