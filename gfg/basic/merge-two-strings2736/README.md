# Alternate Merge Two Strings

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two strings  **s1**  and  **s2**, merge them alternatively i.e. the first character of s1 then the first character of s2 and so on till the strings end.

 **Note:**  Add the whole string if other string is empty.

 **Examples:** 

```
Input: s1 = "Hello", s2 = "Bye"
Output: HBeylelo
Explanation: The characters of both the given strings are arranged alternatlively.

```

```
Input: s1 = "abc", s2 = "def"
Output: adbecf
Explanation: The characters of both the given strings are arranged alternatlively.

```

 **Constraints:** 
1<=|s1|, |s2| <=103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T15:48:04.315Z  

```java
class Solution {
    String merge(String s1, String s2) {
        // code here
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while(i < s1.length() && j < s2.length()){
            sb.append(s1.charAt(i));
            sb.append(s2.charAt(j));
            i++;
            j++;
        }
        if(i < s1.length()) sb.append(s1.substring(i));
        if(j < s2.length()) sb.append(s2.substring(j));
        return sb.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/merge-two-strings2736/1)