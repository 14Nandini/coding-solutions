# Largest With K Swaps

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a number  **k** and string  **s** of digits denoting a positive integer, build the largest number possible by performing swap operations on the digits of  **s** at most  **k** times.

 **Examples :** 

```
Input: s = "1234567", k = 4
Output: 7654321
Explanation: Three swaps can make the input 1234567 to 7654321, swapping 1 with 7, 2 with 6 and finally 3 with 5.

```

```
Input: s = "3435335", k = 3
Output: 5543333
Explanation: Three swaps can make the input 3435335 to 5543333, swapping 3 with 5, 4 with 5 and finally 3 with 4.
```

```
Input: s = "1034", k = 2
Output: 4301
Explanation: Two swaps can make the input 1034 to 4301, swapping 1 with 4 and finally 0 with 3. 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-14T16:49:43.356Z  

```java
class Solution {
    String maxString;

    public String findMaximumNum(String s, int k) {
        maxString = s;
        solve(s.toCharArray(), k, 0);
        return maxString;
    }

    void solve(char[] arr, int k, int index) {
        if (k == 0 || index == arr.length) return;

        int n = arr.length;
        char maxChar = arr[index];

        for (int i = index + 1; i < n; i++) {
            if (arr[i] > maxChar) {
                maxChar = arr[i];
            }
        }

        if (maxChar != arr[index]) k--;

        for (int i = n - 1; i >= index; i--) {
            if (arr[i] == maxChar) {
                swap(arr, index, i);

                String curr = new String(arr);
                if (curr.compareTo(maxString) > 0) {
                    maxString = curr;
                }

                solve(arr, k, index + 1);

                swap(arr, index, i); 
            }
        }
    }

    void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/largest-number-in-k-swaps-1587115620/1)