# Convert One String to Another with Constraints

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings  **s1**  and  **s2**, consisting only of the characters  **'A'**,  **'B'**, and  **'#'**. Determine whether s1 can be transformed into s2 by performing the following operations on s1:

- 'A' can move only towards the left. 
- 'B' can move only towards the right.
- Neither 'A' nor 'B' can cross each other.
- '#' represents an empty position through which 'A' and 'B' can move.

Moving the character at index i one step to the left means swapping it with the character at index i - 1, provided i - 1 >= 0. Similarly, moving it one step to the right means swapping it with the character at index i + 1, provided i + 1 < s1.length().

Return true if s1 can be transformed into s2; otherwise, return false.

 **Examples:** 

```
Input: s1 = #A#B#B#, s2 = A###B#B
Output: true
Explanation: The character 'A' in s1 can move one position towards the left to reach its position in s2, as there are no 'B' characters blocking its movement. Similarly, each 'B' can move towards the right to reach its corresponding position in s2 without crossing any other 'A' or 'B'. Therefore, s1 can be transformed into s2, so the answer is true.
```

```
Input: s1 = #A#B#, s2 = #B#A#
Output: false
Explanation: The character 'A' in s1 is at index 1, whereas the corresponding 'A' in s2 is at index 3. Since 'A' can move only towards the left, it cannot reach a position to the right of its current position. Therefore, s1 cannot be transformed into s2, and hence, the answer is false.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-17T07:49:53.342Z  

```java
class Solution {
	public boolean isItPossible(String s1, String s2) {
		// code here
		if (s1.length() != s2.length())
			return false;
		int n = s1.length();
		int i = 0, j = 0;
		while (i < n || j < n) {
			while (i < n && s1.charAt(i) == '#') {
				i++;
			}
			while (j < n && s2.charAt(j) == '#') {
				j++;
			}
			if ((i == n) != (j == n))
				return false;
			if (i == n && j == n)
				break;
			if (s1.charAt(i) != s2.charAt(j))
				return false;
			if (s1.charAt(i) == 'A' && i < j)
				return false;
			if (s1.charAt(i) == 'B' && i > j)
				return false;
			i++;
			j++;
		}
		return true;
	}
};

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-if-it-is-possible-to-convert-one-string-into-another-with-given-constraints4116/1)