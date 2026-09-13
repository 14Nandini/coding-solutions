# Remove Duplicates from an array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]** consisting of  **positive**  integers, return the array by removing all  **duplicate**  numbers.

 **Example:** 

```
Input: arr[] = [2, 2, 3, 3, 7, 5] 
Output: [2, 3, 7, 5]
Explanation: After removing the duplicates 2 and 3 we get 2 3 7 5.

```

```
Input: arr[] = [1, 2, 3, 4, 5] 
Output: [1, 2, 3, 4, 5]
Explanation: There doesn't exists any duplicate element.
```

 **Constraints:** 
2≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T13:04:00.316Z  

```java
class Solution {
    ArrayList<Integer> remDuplicate(int arr[]) {
        // code here
        HashSet<Integer> hs = new HashSet<>();
        for(int num : arr) hs.add(num);
        return new ArrayList(hs);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-duplicates-in-small-prime-array/1)