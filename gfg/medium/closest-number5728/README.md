# closest-number5728

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T07:12:42.016Z  

```java
class Solution {
	static int closestNumber(int n, int m) {
		// code here
		int q = n/m;
		int a = q*m;
		int b;
		if (n*m>0)
			b = (q + 1)*m;
		else
			b = (q - 1)*m;
		int d1 = Math.abs(n - a);
		int d2 = Math.abs(n - b);
		if (d1<d2)
			return a;
		else if (d2<d1)
			return b;
		else
			return Math.abs(a)>Math.abs(b)?a:b;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/closest-number5728/1)