# find-the-fine4353

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T16:01:24.225Z  

```java
class Solution {
	
	public long totalFine(int date, int car[], int fine[]) {
		// code here
		boolean isEven = false;
		if (date % 2 == 0)
			isEven = true;
		long res = 0;
		for (int i = 0; i < fine.length; i++) {
			if (isEven && car[i] % 2 != 0)
				res += fine[i];
		    else if (!isEven && car[i] % 2 == 0)
		        res += fine[i];
		}
		return res;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-the-fine4353/1)