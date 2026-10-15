# unique-numbers3019

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T16:16:06.968Z  

```java
class solution {
	ArrayList<Integer> uniqueNumbers(int l, int r) {
		// code here
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = l; i <= r; i++) { 
			boolean isUnique = true; 
			boolean[] seen = new boolean[10]; 
			
			if (i == 0) {
				list.add(i);
				continue;
			}
			
			int num = i;
			while (num > 0) {
				int digit = num % 10; 
				
				if (seen[digit]) {
					isUnique = false;
					break;
				}
				
				seen[digit] = true; 
				num /= 10; 
			}
			
			if (isUnique) list.add(i); 
		}
		
		return list;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/unique-numbers3019/1)