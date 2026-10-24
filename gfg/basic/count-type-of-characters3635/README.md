# Count Types of Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**, count the occurrence of the following in it.

- Lowercase characters
- Uppercase characters
- Special characters
- Numeric Values

Note: There are no white spaces in the string.

 **Examples:** 

```
Input: s = "#GeeKs01fOr@gEEks07"
Output: [5, 8, 4, 2]
Explanation: There are 5 uppercase characters, 8 lowercase characters, 4 numeric characters and 2 special characters.
```

```
Input: s = " *GeEkS4GeEkS* "
Output: [6, 4, 1, 2]
Explanation: There are 6 uppercase characters, 4 lowercase characters, 1 numeric character and 2 special characters.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-24T10:48:48.428Z  

```java
class Sol {
    int[] count(String s) {
        // your code here
        int lcnt = 0, ucnt = 0, scnt = 0, ncnt = 0;
        for(char ch : s.toCharArray()){
            if(Character.isLowerCase(ch)) lcnt ++;
            else if(Character.isUpperCase(ch)) ucnt++;
            else if(Character.isDigit(ch)) ncnt++;
            else scnt++;
        }
        return new int[]{ucnt, lcnt, ncnt, scnt};
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-type-of-characters3635/1)