# Duplicates in Array

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer array  **arr[]**, return a list containing all distinct elements that appear more than once in the array. The returned list must maintain the order in which these elements are encountered for the second time in the original array.

 **Note:**  Each duplicate element should appear exactly once in the result. If no duplicates exist return [-1].

 **Example:** 

```
Input: arr[]= [1, 1, 2, 2]
Output: [1, 2]
Explanation: Both 1 and 2 appear more than once. The second occurrence of 1 comes before the second occurrence of 2.
```

```
Input: arr[] = [2, 4, 1, 3, 4, 2, 2, 3]
Output: [4, 2, 3]
Explanation: The second occurrences of 4, 2 and 3 are encountered in that order.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-04T07:14:08.347Z  

```java
class Solution {
	public List<Integer> findDuplicates(int[] arr) {
		// code here
		int max = 0;
          for (int num : arr) {
              if (num > max) {
                  max = num;
              }
          }

          int[] freq = new int[max + 1];
          for (int num : arr) {
              freq[num]++;
          }

          ArrayList<Integer> result = new ArrayList<>();
          HashSet<Integer> added = new HashSet<>();

          for (int num : arr) {
              if (freq[num] > 1 && !added.contains(num)) {
                  result.add(num);
                  added.add(num);
              }
          }

          if (result.isEmpty()) {
              result.add(-1);
          }

          return result;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/unordered-set-find-duplicate/1)