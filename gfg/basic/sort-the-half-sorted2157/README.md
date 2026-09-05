# Sort Two Parts  Sorted

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer array where the two parts around a break point are individually sorted, merge them into a single sorted array.  The break point can be anywhere in the array, including at the beginning or end.

 **Examples:** 

```
Input: arr[] = [2, 3, 8, -1, 7, 10]
Output: [-1, 2, 3, 7, 8, 10] 
Explanation: [2, 3, 8] and [-1, 7, 10] are sorted in the original array. The overall sorted version is [-1 2 3 7 8 10]
```

```
Input: arr[] = [-4, 6, 9, -1, 3]
Output: [-4, -1, 3, 6, 9]
Explanation: [-4, 6, 9] and [-1, 3] are sorted in the original array. The overall sorted version is [-4 -1 3 6 9]
```

```
Input: arr[] = [10, 20, 30]
Output: [10, 20, 30]
Explanation: One part is empty and the other part is whole array which is already sorted.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T10:36:34.297Z  

```java
class Solution {
    public void mergeTwoParts(int[] arr) {
        // code here
        int n = arr.length;
        int mid = n;
        for(int i = 1; i < n; i++){
            if(arr[i-1] > arr[i]){
                mid = i;
                break;
            }
        }
        if(mid == n) return;
        int[] temp = new int[n];
        int p1 = 0, p2= mid, idx = 0;
        while(p1 < mid && p2 < n){
            if(arr[p1] <= arr[p2])
                temp[idx++] = arr[p1++];
            else 
                temp[idx++] = arr[p2++];
        }
        while(p1 < mid) temp[idx++] = arr[p1++];
        while(p2 < n) temp[idx++] = arr[p2++];
        
        for(int i = 0; i < n; i++) arr[i] = temp[i];
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sort-the-half-sorted2157/1)