# Valid Parenthesis String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s` containing only three types of characters: `'('`, `')'` and `' *'`, return `true`* if *`s`* is  **valid** *.

The following rules define a  **valid**  string:

- Any left parenthesis '(' must have a corresponding right parenthesis ')'.
- Any right parenthesis ')' must have a corresponding left parenthesis '('.
- Left parenthesis '(' must go before the corresponding right parenthesis ')'.
- '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".

 

 **Example 1:** 

```
Input: s = "()"
Output: true

```

 **Example 2:** 

```
Input: s = "(*)"
Output: true

```

 **Example 3:** 

```
Input: s = "(*))"
Output: true

```

 **Example 4:** 

```
Input: s = "("
Output: false

```

 

 **Constraints:** 

- 1 <= s.length <= 100
- s[i] is '(', ')' or '*'.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.8 MB (beats 34.06%)  
**Submitted:** 2026-10-04T09:00:41.634Z  

```java
class Solution {
    public boolean checkValidString(String s) {
        int i = 0, j = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                i++;
                j++;
            }
            else if (c == ')') {
                i = Math.max(0, i - 1);
                j--;
            }
            else {
                i = Math.max(0, i - 1);
                j++;
            }

            if (j < 0) return false;
        }

        return i == 0;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-parenthesis-string/)