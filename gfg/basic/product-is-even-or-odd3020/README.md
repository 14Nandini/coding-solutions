# Array Product Even or Odd

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]**  of integers, find if the product of all its elements is even or odd. Return true if the product is even else false.

 **Examples:** 

```
Input: arr[] = [2, 4, 3, 5]
Output: Even
Explanation: Product = 2  *4*  3 * 5 = 120, 120 is even.
```

```
Input: arr[] = [3, 9, 7, 1]
Output: Odd
Explanation: Product = 3  *9*  7 * 1 = 189, 189 is odd.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T15:11:48.705Z  

```java
class Solution {
    public boolean isProductEven(ArrayList<Integer> arr) {
        // code here.
        int prod = 1;
        for(int num : arr){
            prod = prod * num;
        }
        if(prod % 2 == 0) return true;
        else return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/product-is-even-or-odd3020/1)