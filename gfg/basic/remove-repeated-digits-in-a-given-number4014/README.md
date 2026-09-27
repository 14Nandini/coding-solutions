# Remove Repeated Digits

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a number n, remove consecutive repeated digits from it.

 **Examples:** 

```
Input: n = 1224
Output: 124
Explanation: Two consecutive occurrences of 2 have been reduced to one.

```

```
Input: n = 1242
Output: 1242
Explanation: No digit is repeating consecutively in n.

```

 **Constraints:** 
1<=n<=1018

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-27T15:21:06.924Z  

```java
class Solution {
    public long modify(long N) {
        // code here
        StringBuilder sb = new StringBuilder();
        long prev = -1;
        while(N > 0){
            long curr = N % 10;
            if(prev != curr) sb.append(curr);
            prev = curr;
            N = N / 10;
        }
        sb.reverse();
        return Long.parseLong(sb.toString());
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-repeated-digits-in-a-given-number4014/1)