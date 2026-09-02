# Check Arithmetic Progression

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]**  of integers. Write a program to check whether an arithmetic progression can be formed using all the given elements. 

 **Examples:** 

```
Input: arr[] = [0, 12, 4, 8]
Output: true
Explanation: Rearrange given array as [0, 4, 8, 12] which forms an arithmetic progression.
```

```
Input: arr[] = [12, 40, 11, 20]
Output: false
Explanation: there is no rearrangment which can forms an arithmetic progression.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-02T14:06:24.419Z  

```java
class Solution {
    // Function to check if the given array forms an arithmetic progression
    public boolean checkIsAP(int[] arr) {
        // Your code goes here
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - arr[i-1] != diff) return false;
        }
        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-arithmetic-progression1842/1)