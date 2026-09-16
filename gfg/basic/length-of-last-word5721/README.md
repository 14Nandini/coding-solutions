# Length of the Last Word

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**  consisting of upper-case and lower-case alphabets along with space characters ' ', return the length of the last word present in the string.

Note: The string may contain trailing spaces.

**Examples :
**

```
Input: s = "Geeks for Geeks"
Output: 5
Explanation: The last word is "Geeks" of length 5.
```

```
Input: s = "Start Coding Here "
Output: 4
Explanation: The last word is "Here" of length 4.
```

 **Constraints:** 
1 ≤ |s| ≤ 100
|s| denotes the length of the string s.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T05:11:22.608Z  

```java
class Solution {
    public int lastWordLen(String s) {
        // code here
        int len = 0, i = s.length()- 1;
        while(i >= 0 && s.charAt(i) == ' ') i--;
        while(i >= 0 && s.charAt(i) != ' '){
            len++;
            i--;
        }
        return len;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/length-of-last-word5721/1)