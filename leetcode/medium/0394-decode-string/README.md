# Decode String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an encoded string, return its decoded string.

The encoding rule is: `k[encoded_string]`, where the `encoded_string` inside the square brackets is being repeated exactly `k` times. Note that `k` is guaranteed to be a positive integer.

You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, `k`. For example, there will not be input like `3a` or `2[4]`.

The test cases are generated so that the length of the output will never exceed `105`.

 

 **Example 1:** 

```
Input: s = "3[a]2[bc]"
Output: "aaabcbc"

```

 **Example 2:** 

```
Input: s = "3[a2[c]]"
Output: "accaccacc"

```

 **Example 3:** 

```
Input: s = "2[abc]3[cd]ef"
Output: "abcabccdcdcdef"

```

 

 **Constraints:** 

- 1 <= s.length <= 30
- s consists of lowercase English letters, digits, and square brackets '[]'.
- s is guaranteed to be a valid input.
- All the integers in s are in the range [1, 300].

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 83.83%)  
**Memory:** 42.5 MB (beats 96.66%)  
**Submitted:** 2026-09-15T17:32:39.793Z  

```java
class Solution {
    public String decodeString(String s) {
        Stack<Integer> num = new Stack<>();
        Stack<String> str = new Stack<>();
        int k = 0;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                k = k * 10 + (ch - '0');
            }
            else if(ch == '['){
                num.push(k);
                str.push(String.valueOf(ch));
                k = 0;
            }
            else if(ch == ']'){
                StringBuilder sb = new StringBuilder();
                while(!str.isEmpty() && !str.peek().equals("[")){
                    sb.insert(0, str.pop());
                }
                if(!str.isEmpty()) str.pop();
                String rpt = sb.toString().repeat(num.pop());
                str.push(rpt);
            }
            else str.push(String.valueOf(ch));
        }
        StringBuilder result = new StringBuilder();
        while (!str.isEmpty()) result.insert(0, str.pop());
        return result.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/decode-string/)