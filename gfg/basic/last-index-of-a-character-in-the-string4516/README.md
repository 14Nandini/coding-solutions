# Last Index of Character

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**  of size  **n**  and a character  **c**, find the last index (0-based indexing) of c in s. If the character is not present, return -1. Both s and c contain only lowercase and uppercase English alphabets.

 **Examples:** 

```
Input: s = "Geeks", c = 'e'
Output: 2
Explanation: The last occurrence of 'e' is at index 2.

```

```
Input: s = "okiyh", c = 'z'
Output: -1
Explanation: The character 'z' is not present in the string.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T05:45:20.073Z  

```java
class Solution {
	int lastIndex(String s, char c) {
		// code here
		int indx = -1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) indx = i;
		}
		return indx;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/last-index-of-a-character-in-the-string4516/1)