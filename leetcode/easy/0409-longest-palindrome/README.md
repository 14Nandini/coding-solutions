# Longest Palindrome

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s` which consists of lowercase or uppercase letters, return the length of the  **longest palindrome**  that can be built with those letters.

Letters are  **case sensitive**, for example, `"Aa"` is not considered a palindrome.

 

 **Example 1:** 

```
Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.

```

 **Example 2:** 

```
Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.

```

 

 **Constraints:** 

- 1 <= s.length <= 2000
- s consists of lowercase and/or uppercase English letters only.

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 58.53%)  
**Memory:** 43.7 MB (beats 6.83%)  
**Submitted:** 2026-09-12T06:59:24.736Z  

```java
class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> hs = new HashSet<>();
        int len = 0;
        for(char ch : s.toCharArray()){
            if(hs.contains(ch)){
                hs.remove(ch);
                len += 2;
            }
            else hs.add(ch);
        }
        if(hs.size() > 0) len++;
        return len;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-palindrome/)