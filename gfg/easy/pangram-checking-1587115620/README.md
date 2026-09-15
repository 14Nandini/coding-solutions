# Panagram Checking

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string s, check if it is a "Panagram" or not.  A "Panagram" is a sentence containing every letter in the English Alphabet either in lowercase or Uppercase.

 **Examples:** 

```
Input: s = "Bawds jog, flick quartz, vex nymph"
Output: true
Explanation: In the given string, there are all the letters of the English alphabet. Hence, the output is true.

```

```
Input: s = "sdfs"
Output: false
Explanation: In the given string, there aren't all the letters present in the English alphabet. Hence, the output is false.
```

 **Constraints:** 
1 ≤ |s| ≤ 104
The string may contain any ASCII character.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-15T14:07:19.716Z  

```java
class Solution {
    public static boolean checkPangram(String s) {
        // code here
        
        int n = s.length();
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            ch = Character.toLowerCase(ch);
            if(ch >= 'a' && ch <= 'z')
                freq[ch - 'a'] = 1;
        }
        for(int i = 0; i < freq.length; i++){
            if(freq[i] == 0) return false;
        }
        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/pangram-checking-1587115620/1)