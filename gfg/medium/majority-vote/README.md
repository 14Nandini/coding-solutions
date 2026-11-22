# Majority Element - More Than n/3

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr**  **[]**  consisting of  **n**  integers, find all the array elements which occurs more than  **floor(n/3)**  times. Return the resulting array in strictly increasing order. If no such elements exist, return an empty array.

 **Examples:** 

```
Input: arr[] = [2, 2, 3, 1, 3, 2, 1, 1]
Output: [1, 2]
Explanation: The frequency of 1 and 2 is 3, which is more than floor n/3 (8/3 = 2).
```

```
Input:  arr[] = [-5, 3, -5]
Output: [-5]
Explanation: The frequency of -5 is 2, which is more than floor n/3 (3/3 = 1).

```

```
Input:  arr[] = [3, 2, 2, 4, 1, 4]
Output: []
Explanation: There is no majority element.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-22T07:21:55.004Z  

```java
class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> al = new ArrayList<>();
        int c1 = 0, c2 = 0;
        int cnt1 = 0, cnt2 = 0;
        for (int num : arr) {
            if (num == c1) cnt1++;
            else if (num == c2) 
                cnt2++;
            else if (cnt1 == 0) 
            {
                c1 = num;
                cnt1 = 1;
            }
            else if (cnt2 == 0) {
                c2 = num;
                cnt2 = 1;
            } 
            else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0; cnt2 = 0;
        for (int num : arr) {
            if (num == c1)
                cnt1++;
            else if (num == c2) cnt2++;
        }
        int t = n / 3;
        if (cnt1 > t) al.add(c1);
        if (cnt2 > t) al.add(c2);
        Collections.sort(al);
        return al;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/majority-vote/1)