# power-of-2-1587115620

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-12T15:54:49.122Z  

```java
class Solution {
	public boolean isPowerofTwo(int n) {
		// code here
		int res = 0;
		String s1 = "";
		while (n != 0) {
			res = n%2;
			n /= 2;
			s1 += res;
		}
		int c = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == '1')
				c++;
		}
		if (c == 1) return true;
		else return false;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/power-of-2-1587115620/1)