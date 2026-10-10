# Detect Capital

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

We define the usage of capitals in a word to be right when one of the following cases holds:

- All letters in this word are capitals, like "USA".
- All letters in this word are not capitals, like "leetcode".
- Only the first letter in this word is capital, like "Google".

Given a string `word`, return `true` if the usage of capitals in it is right.

 

 **Example 1:** 

```
Input: word = "USA"
Output: true

```

 **Example 2:** 

```
Input: word = "FlaG"
Output: false

```

 

 **Constraints:** 

- 1 <= word.length <= 100
- word consists of lowercase and uppercase English letters.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 89.21%)  
**Memory:** 43.1 MB (beats 61.36%)  
**Submitted:** 2026-10-10T09:54:30.576Z  

```java
class Solution {
    public boolean detectCapitalUse(String word) {
        int c = 0;
        for(char ch : word.toCharArray()){
            if(Character.isUpperCase(ch)) c++;
        }
        if(c == 0 || c == word.length()) return true;
        if(c == 1 && Character.isUpperCase(word.charAt(0))) return true;
        return false;   
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/detect-capital/)