# Longest Common Prefix of Strings

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array of strings  **arr[].**  Return the  **longest common prefix**  among each and every strings present in the array. If there's no prefix common in all the strings, return "".

 **Examples :** 

```
Input: arr[] = ["geeksforgeeks", "geeks", "geek", "geezer"]
Output: "gee"
Explanation: "gee" is the longest common prefix in all the given strings.

```

```
Input: arr[] = ["hello", "world"]
Output: ""
Explanation: There's no common prefix in the given strings.
```

 **Constraints:** 
1 ≤ |arr| ≤ 103
1 ≤ |arr[i]| ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-08T15:53:47.287Z  

```java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        int n = arr.length;
        if(n == 1) return arr[0];
        Arrays.sort(arr);
        StringBuilder res = new StringBuilder();
        char[] first = arr[0].toCharArray();
        char[] last = arr[n - 1].toCharArray();
        for(int i = 0; i < n; i++){
            if(first[i] != last[i]) break;
            res.append(first[i]);
        }
        return res.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/longest-common-prefix-in-an-array5129/1)