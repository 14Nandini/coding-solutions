# Lexicographically Smallest and Largest

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array of strings s[]. You need to find the lexicographically smallest and largest.

 **Examples:** 

```
Input: s[] = [a, ab, abc]
Output: [a, abc]
Explanation: Lexicographically smallest is "a" and largest is "abc".
```

```
Input: s[] = [abc, abc]
Output: [abc, abc]
Explanation: Lexicographically smallest is "abc" and largest is also "abc" 
```

**Constraints:
**1 ≤ s.size() ≤ 103
1 ≤ s[i].size() ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T13:03:59.659Z  

```java
class Solution {

    ArrayList<String> orderString(ArrayList<String> s) {
        // code here
        Collections.sort(s);
        ArrayList<String> res = new ArrayList<>();
        res.add(s.get(0));
        res.add(s.get(s.size()-1));
        return res;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/ordering-of-strings5527/1)