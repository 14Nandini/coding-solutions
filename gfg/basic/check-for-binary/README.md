# Check for Binary String

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a non-empty sequence of characters  **s**, return true if sequence is Binary, else false.

 **Examples:** 

```
Input: s = "101"
Output: true
Explanation: Since string contains only '0' and '1', output is true.

```

```
Input: s = "75"
Output: false
Explanation: Since string contains digits other than '0' and '1', output is false.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-28T14:20:40.975Z  

```java
class Solution {
    public boolean isBinary(String s) {
        // code here
        for (char c : s.toCharArray()) {
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-for-binary/1)