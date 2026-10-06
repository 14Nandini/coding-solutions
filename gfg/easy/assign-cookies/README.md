# Assign Cookies

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an array  **greed[]**, where  **greed[i]**  represents the minimum size of cookie required to satisfy the i-th child, and an array  **cookie[]**, where  **cookie[j]** represents the size of the j-th cookie. Each child can receive at most one cookie. A child i will be satisfied if they receive a cookie j such that  **cookie[j] >= greed[i]**. Your task is to determine the  **maximum**  number of children that can be satisfied.

 **Examples:** 

```
Input : greed[] = [1, 10, 3], cookie = [1, 2, 3]
Output: 2
Explanation: We can only assign cookie to the first and third child.
```

```
Input : greed[] = [10, 100], cookie = [1, 2]
Output: 0
Explanation: We can not assign cookies to any child.
```

 **Constraints:** 
1 ≤ greed.size() ≤  105
1 ≤ cookie.size() ≤  105
1 ≤ greed[i], cookie[i] ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T14:37:09.351Z  

```java
class Solution {
    public int maxChildren(int[] greed, int[] cookie) {
        // code here
        Arrays.sort(greed);
        Arrays.sort(cookie);
        int i = 0, j = 0, c = 0;
        while(i < greed.length && j < cookie.length){
            if(greed[i] <= cookie[j]){
                c++;
                i++;
                j++;
            }
            else j++;
        }
        return  c;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/assign-cookies/1)