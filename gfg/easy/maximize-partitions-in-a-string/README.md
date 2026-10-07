# Maximize partitions in a String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s** of lowercase English alphabets, your task is to return the  **maximum**  number of substrings formed, after possible  **partitions**  (probably zero) of  **s** such that  **no two**  substrings have a  **common character**.

 **Examples:** 

```
Input: s = "acbbcc"
Output: 2
Explanation: "a" and "cbbcc" are two substrings that do not share any characters between them.
```

```
Input: s = "ababcbacadefegdehijhklij"
Output: 3
Explanation: Partitioning at the index 8 and at 15 produces three substrings: “ababcbaca”, “defegde”, and “hijhklij” such that none of them have a common character. So, the maximum number of substrings formed is 3.
```

```
Input: s = "aaa"
Output: 1
Explanation: Since the string consists of same characters, no further partition can be performed. Hence, the number of substring (here the whole string is considered as the substring) is 1.

```

 **Constraints:** 
1 ≤ s.size() ≤ 105
'a' ≤ s[i] ≤ 'z'

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T15:40:35.742Z  

```java
class Solution {
	public int maxPartitions(String s) {
		// code here
		int n = s.length();
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = n - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			if (!hm.containsKey(ch))
				hm.put(ch, i);
		}
		int j = 0, c = 0;
		for (int k = 0; k < n; k++) {
			char ch = s.charAt(k);
			int lastOcc = hm.get(ch);
			j = Math.max(j, lastOcc);
			if (k == j) {
				c++;
			}
		}
		return c;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximize-partitions-in-a-string/1)