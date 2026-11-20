# Remove Duplicate Letters

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, remove duplicate letters so that every letter appears once and only once. The relative order of the letters that were not removed must be preserved. You must make sure your result is  **the smallest in lexicographical order**  among all possible results.

 

Original
Java
 **Example 1:** 

```
Input: s = "bcabc"
Output: "abc"

```

 **Example 2:** 

```
Input: s = "cbacdcbc"
Output: "acdb"

```

 

 **Constraints:** 

- 1 <= s.length <= 104
- s consists of lowercase English letters.

 

 **Note:**  This question is the same as 1081: https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 83.69%)  
**Memory:** 43.1 MB (beats 85.79%)  
**Submitted:** 2026-11-19T16:24:58.004Z  

```java
class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        boolean[] visited = new boolean[26];
        
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        
        StringBuilder stack = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (visited[ch - 'a']) continue;
            
            while (stack.length() > 0 &&
                   stack.charAt(stack.length() - 1) > ch &&
                   lastIndex[stack.charAt(stack.length() - 1) - 'a'] > i) {
                
                visited[stack.charAt(stack.length() - 1) - 'a'] = false;
                stack.deleteCharAt(stack.length() - 1);
            }
            
            stack.append(ch);
            visited[ch - 'a'] = true;
        }
        
        return stack.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/remove-duplicate-letters/)