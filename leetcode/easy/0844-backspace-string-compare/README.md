# Backspace String Compare

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`, return `true`  *if they are equal when both are typed into empty text editors*. `'#'` means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

 

 **Example 1:** 

```
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".

```

 **Example 2:** 

```
Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".

```

 **Example 3:** 

```
Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".

```

 

 **Constraints:** 

- 1 <= s.length, t.length <= 200
- s and t only contain lowercase letters and '#' characters.

 

 **Follow up:**  Can you solve it in `O(n)` time and `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 20.25%)  
**Memory:** 43.5 MB (beats 10.67%)  
**Submitted:** 2026-09-15T17:44:11.610Z  

```java
class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1 = "", t1 = "";
        int cnt = 0;
        for(int i = s.length()-1; i >= 0; i--){
            char ch = s.charAt(i);
            if(ch == '#') cnt++;
            else{
                if(cnt > 0){
                    cnt--;
                    continue;
                } 
                s1 = ch + s1;
            }
        }
        cnt = 0;
        for(int i = t.length()-1; i >= 0; i--){
            char ch = t.charAt(i);
            if(ch == '#') cnt++;
            else{
                if(cnt > 0){
                    cnt--;
                    continue;
                } 
                t1 = ch + t1;
            }
        }
        return s1.equals(t1);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/backspace-string-compare/)