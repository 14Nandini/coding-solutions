# Longest Prefix Suffix

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given a string  **s**, of lowercase english alphabets, find the length of the longest proper prefix which is also a suffix.
 **Note:**  Prefix and suffix can be overlapping but they should not be equal to the entire string.

 **Examples :** 

```
Input: s = "abab"
Output: 2
Explanation: The string "ab" is the longest prefix and suffix. 
```

```
Input: s = "aabcdaabc"
Output: 4
Explanation: The string "aabc" is the longest prefix and suffix.

```

```
Input: s = "aaaa"
Output: 3
Explanation: "aaa" is the longest prefix and suffix. 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-08T16:53:13.221Z  

```java
class Solution {
    int getLPSLength(String s) {
        
        int n=s.length();
        int p=0;
        int su=1;
        int count=0;
        int pos=1;
        while(p<n && su<n){
            if(s.charAt(p)==s.charAt(su)){
                p++;
                su++;
                count++;
            }
            else{
                p=0;
                count=0;
                pos++;
                su=pos;
            }
        }
        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/longest-prefix-suffix2527/1)