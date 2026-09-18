# String Functions

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings  **s1**  and  **s2**, perform the following operations on s1:

- trim() should remove all leading and trailing spaces from s1.
- exists() should find the first occurrence of s2 in s1 and return its index. If s2 is not present, return -1.
- titleIt() should convert the first character of each word in s1 to uppercase.
- casesSwap() should swap the case of every character in s1.

Implement these operations and return the required results.

 **Examples:** 

```
Input: s1 = "hello", s2 = "llo"
Output:
hello 
2 
Hello 
HELLO
```

```
Input: s1 = " Hello World ", s2 = "geek"
Output:
Hello World
-1
Hello World
hELLO wORLD
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T05:06:47.273Z  

```java
class Solution {
    public String trim(String s1) {
        return s1.trim();
    }

    public int exists(String s1, String s2) {
        return s1.indexOf(s2);
    }

    public String titleIt(String s1) {
        StringBuilder sb = new StringBuilder();
        boolean capitalizeNext = true;

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);

            if (c == ' ') {
                capitalizeNext = true;
                sb.append(c);
            } else if (capitalizeNext) {
                sb.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public String casesSwap(String s1) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);

            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/string-functions-i/1)