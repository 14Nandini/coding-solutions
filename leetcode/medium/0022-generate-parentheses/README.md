# Generate Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given `n` pairs of parentheses, write a function to  *generate all combinations of well-formed parentheses*.

 

 **Example 1:** 

```
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]

```

 **Example 2:** 

```
Input: n = 1
Output: ["()"]

```

 

 **Constraints:** 

- 1 <= n <= 8

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 14.45%)  
**Memory:** 44.8 MB (beats 43.53%)  
**Submitted:** 2026-10-02T09:22:44.835Z  

```java
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrack(list, "", 0, 0, n);
        return list;
    }
    private void backtrack(List<String> res, String currStr, int openCnt, int closeCnt, int max){
        if(currStr.length() == max*2){
            res.add(currStr);
            return;
        }

        if(openCnt < max)
            backtrack(res, currStr + "(", openCnt + 1, closeCnt, max);
        if(closeCnt < openCnt)
            backtrack(res, currStr + ")", openCnt, closeCnt + 1, max);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/generate-parentheses/)