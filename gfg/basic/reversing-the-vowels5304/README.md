# Reverse Vowels

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string consisting of lowercase English alphabets, reverse only the vowels present in it and print the resulting string.

 **Examples:** 

```
Input: s = "geeksforgeeks"
Output: "geeksforgeeks"
Explanation: The vowels are: e, e, o, e, e. Reverse of these is also e, e, o, e, e.

```

```
Input: s = "practice"
Output: "prectica"
Explanation: The vowels are a, i, e. Reverse of these is e, i, a.

```

```
Input: s = "bcdfg"
Output: "bcdfg"
Explanation: There are no vowels in s.
```

 **Constraints:** 
1<=|s|<=105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T14:44:59.533Z  

```java
class Solution {
    String modify(String s) {
        StringBuilder vow = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(isVowel(ch))
                vow.append(ch);
        }
        vow.reverse();
        StringBuilder res = new StringBuilder();
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                res.append(vow.charAt(j));
                j++;
            } else {
                res.append(ch);
            }
        }
        return res.toString();
    }
    boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reversing-the-vowels5304/1)