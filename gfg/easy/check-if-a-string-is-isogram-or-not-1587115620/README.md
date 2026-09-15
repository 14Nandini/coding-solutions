# Check for Isogram String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**  of lowercase alphabets, check if it is Isogram or not.  An Isogram is a string in which no letter occurs more than once.

 **Examples:** 

```
Input: s = "machine"
Output: true
Explanation: "machine" is an Isogram as no letter has appeared twice. so we return true.

```

```
Input: s = "geeks"
Output: false
Explanation: "geeks" is not an Isogram as 'e' appears twice. so we return false.
```

 **Constraints:** 
1 ≤ |s| ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-15T14:10:09.070Z  

```java


class Solution {
    // Function to check if a string is Isogram or not.
    static boolean isIsogram(String data) {
        // Your code here
        HashSet<Character> hs = new HashSet<>();
        for(char ch : data.toCharArray()){
            if(hs.contains(ch)) return false;
            hs.add(ch);
        }
        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-if-a-string-is-isogram-or-not-1587115620/1)