# Longest Common Prefix

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string `""`.

 

 **Example 1:** 

```
Input: strs = ["flower","flow","flight"]
Output: "fl"

```

 **Example 2:** 

```
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

```

 

 **Constraints:** 

- 1 <= strs.length <= 200
- 0 <= strs[i].length <= 200
- strs[i] consists of only lowercase English letters if it is non-empty.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 60.29%)  
**Memory:** 43.1 MB (beats 82.65%)  
**Submitted:** 2026-09-08T15:58:07.927Z  

```java
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        int n = strs.length;
        if(n == 1) return strs[0];
        StringBuilder res = new StringBuilder();
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[n - 1].toCharArray();
        int minLength = Math.min(first.length, last.length);
        for(int i = 0; i < minLength; i++){
            if(first[i] != last[i]) break;
            res.append(first[i]);
        }
        return res.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-common-prefix/)