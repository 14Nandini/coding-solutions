# Valid Palindrome II

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, return `true`  *if the* `s` *can be palindrome after deleting  **at most one**  character from it*.

 

 **Example 1:** 

```
Input: s = "aba"
Output: true

```

 **Example 2:** 

```
Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.

```

 **Example 3:** 

```
Input: s = "abc"
Output: false

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 98.22%)  
**Memory:** 47.9 MB (beats 29.30%)  
**Submitted:** 2026-10-02T08:56:13.048Z  

```java
class Solution {
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else
                return isPalindrome(s, i+1, j) || isPalindrome(s, i, j-1);
        }
        return true;
    }

    private boolean isPalindrome(String s, int i, int j){
        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-palindrome-ii/)